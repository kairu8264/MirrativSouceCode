package wm;

import android.content.Context;
import com.google.android.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, k> f59208c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f59209a;

    /* renamed from: b  reason: collision with root package name */
    public final String f59210b;

    public k(Context context, String str) {
        this.f59209a = context;
        this.f59210b = str;
    }

    public static synchronized k c(Context context, String str) {
        k kVar;
        synchronized (k.class) {
            Map<String, k> map = f59208c;
            if (!map.containsKey(str)) {
                map.put(str, new k(context, str));
            }
            kVar = map.get(str);
        }
        return kVar;
    }

    public synchronized Void a() {
        this.f59209a.deleteFile(this.f59210b);
        return null;
    }

    public String b() {
        return this.f59210b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.a d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f59209a.openFileInput(this.f59210b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            com.google.firebase.remoteconfig.internal.a b10 = com.google.firebase.remoteconfig.internal.a.b(new JSONObject(new String(bArr, C.UTF8_NAME)));
            fileInputStream.close();
            return b10;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th2;
        }
    }

    public synchronized Void e(com.google.firebase.remoteconfig.internal.a aVar) throws IOException {
        FileOutputStream openFileOutput = this.f59209a.openFileOutput(this.f59210b, 0);
        openFileOutput.write(aVar.toString().getBytes(C.UTF8_NAME));
        openFileOutput.close();
        return null;
    }
}
