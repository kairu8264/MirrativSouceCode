package ak;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: d  reason: collision with root package name */
    public static final dk.f f13451d = new dk.f("PackMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13452a;

    /* renamed from: b  reason: collision with root package name */
    public final k3 f13453b;

    /* renamed from: c  reason: collision with root package name */
    public final ck.b f13454c;

    public i3(o0 o0Var, k3 k3Var, ck.b bVar) {
        this.f13452a = o0Var;
        this.f13453b = k3Var;
        this.f13454c = bVar;
    }

    public final String a(String str) {
        if (this.f13454c.a("assetOnlyUpdates") && this.f13452a.g(str)) {
            int a10 = this.f13453b.a();
            o0 o0Var = this.f13452a;
            File y10 = o0Var.y(str, a10, o0Var.s(str));
            try {
                if (!y10.exists()) {
                    return String.valueOf(a10);
                }
                FileInputStream fileInputStream = new FileInputStream(y10);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(a10) : property;
            } catch (IOException unused) {
                f13451d.b("Failed to read pack version tag for pack %s", str);
            }
        }
        return "";
    }

    public final void b(String str, int i10, long j10, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File y10 = this.f13452a.y(str, i10, j10);
        y10.getParentFile().mkdirs();
        y10.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(y10);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }
}
