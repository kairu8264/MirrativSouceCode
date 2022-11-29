package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: w  reason: collision with root package name */
    public final HttpURLConnection f18851w;

    public a(HttpURLConnection httpURLConnection) {
        this.f18851w = httpURLConnection;
    }

    @Override // c7.d
    public String Z() {
        return this.f18851w.getContentType();
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18851w.disconnect();
    }

    @Override // c7.d
    public InputStream f0() throws IOException {
        return this.f18851w.getInputStream();
    }

    @Override // c7.d
    public String n1() {
        try {
            if (u0()) {
                return null;
            }
            return "Unable to fetch " + this.f18851w.getURL() + ". Failed with " + this.f18851w.getResponseCode() + "\n" + a(this.f18851w);
        } catch (IOException e10) {
            f7.d.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // c7.d
    public boolean u0() {
        try {
            return this.f18851w.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
