package rp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes4.dex */
public final class t {
    public static final f0 a() {
        return v.a();
    }

    public static final d b(f0 f0Var) {
        return v.b(f0Var);
    }

    public static final e c(h0 h0Var) {
        return v.c(h0Var);
    }

    public static final boolean d(AssertionError assertionError) {
        return u.b(assertionError);
    }

    public static final f0 e(File file, boolean z10) throws FileNotFoundException {
        return u.c(file, z10);
    }

    public static final f0 f(OutputStream outputStream) {
        return u.d(outputStream);
    }

    public static final f0 g(Socket socket) throws IOException {
        return u.e(socket);
    }

    public static final h0 i(File file) throws FileNotFoundException {
        return u.g(file);
    }

    public static final h0 j(InputStream inputStream) {
        return u.h(inputStream);
    }

    public static final h0 k(Socket socket) throws IOException {
        return u.i(socket);
    }
}
