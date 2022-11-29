package rp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final /* synthetic */ class u {

    /* renamed from: a */
    public static final Logger f51730a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        jo.p.h(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message == null ? false : so.o.H(message, "getsockname failed", false, 2, null);
        }
        return false;
    }

    public static final f0 c(File file, boolean z10) throws FileNotFoundException {
        jo.p.h(file, "<this>");
        return t.f(new FileOutputStream(file, z10));
    }

    public static final f0 d(OutputStream outputStream) {
        jo.p.h(outputStream, "<this>");
        return new x(outputStream, new i0());
    }

    public static final f0 e(Socket socket) throws IOException {
        jo.p.h(socket, "<this>");
        g0 g0Var = new g0(socket);
        OutputStream outputStream = socket.getOutputStream();
        jo.p.g(outputStream, "getOutputStream()");
        return g0Var.x(new x(outputStream, g0Var));
    }

    public static /* synthetic */ f0 f(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return t.e(file, z10);
    }

    public static final h0 g(File file) throws FileNotFoundException {
        jo.p.h(file, "<this>");
        return new p(new FileInputStream(file), i0.f51701e);
    }

    public static final h0 h(InputStream inputStream) {
        jo.p.h(inputStream, "<this>");
        return new p(inputStream, new i0());
    }

    public static final h0 i(Socket socket) throws IOException {
        jo.p.h(socket, "<this>");
        g0 g0Var = new g0(socket);
        InputStream inputStream = socket.getInputStream();
        jo.p.g(inputStream, "getInputStream()");
        return g0Var.y(new p(inputStream, g0Var));
    }
}
