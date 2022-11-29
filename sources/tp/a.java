package tp;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char f53899a = File.separatorChar;

    /* renamed from: b  reason: collision with root package name */
    public static final String f53900b;

    static {
        up.a aVar = new up.a(4);
        PrintWriter printWriter = new PrintWriter(aVar);
        printWriter.println();
        f53900b = aVar.toString();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(Reader reader) {
        a(reader);
    }

    public static void c(Writer writer) {
        a(writer);
    }
}
