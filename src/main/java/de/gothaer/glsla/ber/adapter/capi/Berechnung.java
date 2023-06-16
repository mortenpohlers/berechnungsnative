package de.gothaer.glsla.ber.adapter.capi;

import de.gothaer.glsla.ber.application.BerechungsServiceProvider;
import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;
import org.graalvm.nativeimage.c.type.CCharPointer;
import org.graalvm.nativeimage.c.type.CTypeConversion;

/**
 * Hello world!
 */
public class Berechnung {
    @CEntryPoint(name = "berechnung")
    public static CCharPointer multiply(IsolateThread thread, CCharPointer vorgabe) {
        try {
            var vorgabeJsonString = CTypeConversion.toJavaString(vorgabe);
            var berechnungsVorgabe = JsonConverter.unmarshall(vorgabeJsonString);
            var berechnungsService = BerechungsServiceProvider.createBerechungsService();
            var ergebnis = berechnungsService.berechneUndSpeicher(berechnungsVorgabe);
            var ergebnisJsonString = JsonConverter.marshall(ergebnis);
            return CTypeConversion.toCString(ergebnisJsonString).get();

        } catch (Throwable e) {
            System.err.println("Fatal Error, empty result\n" + e.toString()+"\n");
            return CTypeConversion.toCString("").get();
        }
    }

    public static void main(String args[]) {

    }
}
