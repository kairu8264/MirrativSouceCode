package hl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final File f36114a;

    public a(fl.f fVar) {
        this.f36114a = fVar.d("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.f36114a;
    }

    public JSONObject b() {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        xk.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a10 = a();
                if (a10.exists()) {
                    fileInputStream = new FileInputStream(a10);
                    try {
                        jSONObject = new JSONObject(al.g.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        xk.f.f().e("Failed to fetch cached settings", e);
                        al.g.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    xk.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                al.g.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                al.g.e(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            al.g.e(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j10, JSONObject jSONObject) {
        xk.f.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    al.g.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    xk.f.f().e("Failed to cache settings", e);
                    al.g.e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    al.g.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
