package hn;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f36136a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36137b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f36138c;

    public c0(String str, int i10, d0 d0Var) {
        this.f36136a = str;
        this.f36137b = i10;
        this.f36138c = d0Var;
    }

    public final void a(StringBuilder sb2) {
        for (Map.Entry<String, List<String>> entry : this.f36138c.a().entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                if (str == null) {
                    str = "";
                }
                sb2.append(key);
                sb2.append(": ");
                sb2.append(str);
                sb2.append("\r\n");
            }
        }
    }

    public final void b(StringBuilder sb2) {
        String c10 = this.f36138c.c();
        if (c10 == null || c10.length() == 0) {
            return;
        }
        String d10 = this.f36138c.d();
        if (d10 == null) {
            d10 = "";
        }
        String format = String.format("%s:%s", c10, d10);
        sb2.append("Proxy-Authorization: Basic ");
        sb2.append(b.a(format));
        sb2.append("\r\n");
    }

    public final String c() {
        String format = String.format("%s:%d", this.f36136a, Integer.valueOf(this.f36137b));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CONNECT ");
        sb2.append(format);
        sb2.append(" HTTP/1.1");
        sb2.append("\r\n");
        sb2.append("Host: ");
        sb2.append(format);
        sb2.append("\r\n");
        a(sb2);
        b(sb2);
        sb2.append("\r\n");
        return sb2.toString();
    }

    public String d() {
        return this.f36136a;
    }

    public void e(Socket socket) throws IOException {
        h(socket);
        g(socket);
    }

    public final void f(InputStream inputStream) throws IOException {
        String o10 = t.o(inputStream, C.UTF8_NAME);
        if (o10 != null && o10.length() != 0) {
            String[] split = o10.split(" +", 3);
            if (split.length >= 2) {
                if ("200".equals(split[1])) {
                    return;
                }
                throw new IOException("The status code in the response from the proxy server is not '200 Connection established'. The status line is: " + o10);
            }
            throw new IOException("The status line in the response from the proxy server is badly formatted. The status line is: " + o10);
        }
        throw new IOException("The response from the proxy server does not contain a status line.");
    }

    public final void g(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        f(inputStream);
        i(inputStream);
    }

    public final void h(Socket socket) throws IOException {
        byte[] d10 = t.d(c());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(d10);
        outputStream.flush();
    }

    public final void i(InputStream inputStream) throws IOException {
        while (true) {
            int i10 = 0;
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    throw new EOFException("The end of the stream from the proxy server was reached unexpectedly.");
                }
                if (read == 10) {
                    if (i10 == 0) {
                        return;
                    }
                } else if (read != 13) {
                    i10++;
                } else {
                    int read2 = inputStream.read();
                    if (read2 == -1) {
                        throw new EOFException("The end of the stream from the proxy server was reached unexpectedly after a carriage return.");
                    }
                    if (read2 != 10) {
                        i10 += 2;
                    } else if (i10 == 0) {
                        return;
                    }
                }
            }
        }
    }
}
