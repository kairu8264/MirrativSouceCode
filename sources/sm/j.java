package sm;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final URL f52760a;

    public j(URL url) {
        this.f52760a = url;
    }

    public URLConnection a() throws IOException {
        return this.f52760a.openConnection();
    }

    public String toString() {
        return this.f52760a.toString();
    }
}
