package em;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import vl.f;

/* loaded from: classes4.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final pk.c f30647a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f30648b;

    /* renamed from: c  reason: collision with root package name */
    public final mh.d f30649c;

    /* renamed from: d  reason: collision with root package name */
    public final xl.b<um.i> f30650d;

    /* renamed from: e  reason: collision with root package name */
    public final xl.b<vl.f> f30651e;

    /* renamed from: f  reason: collision with root package name */
    public final yl.f f30652f;

    public a0(pk.c cVar, e0 e0Var, mh.d dVar, xl.b<um.i> bVar, xl.b<vl.f> bVar2, yl.f fVar) {
        this.f30647a = cVar;
        this.f30648b = e0Var;
        this.f30649c = dVar;
        this.f30650d = bVar;
        this.f30651e = bVar2;
        this.f30652f = fVar;
    }

    public a0(pk.c cVar, e0 e0Var, xl.b<um.i> bVar, xl.b<vl.f> bVar2, yl.f fVar) {
        this(cVar, e0Var, new mh.d(cVar.h()), bVar, bVar2, fVar);
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final vi.g<String> b(vi.g<Bundle> gVar) {
        return gVar.j(z.f30769w, new vi.a() { // from class: em.y
            @Override // vi.a
            public final Object a(vi.g gVar2) {
                return a0.this.g(gVar2);
            }
        });
    }

    public final String c() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f30647a.j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public vi.g<String> d() {
        return b(i(e0.c(this.f30647a), TopicConstant.MATCH_SINGLE, new Bundle()));
    }

    public final String e(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(MRLog.PAYLOAD_KEY_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String obj = bundle.toString();
            Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public /* synthetic */ String g(vi.g gVar) throws Exception {
        return e((Bundle) gVar.p(IOException.class));
    }

    public final void h(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        f.a a10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f30647a.k().c());
        bundle.putString("gmsv", Integer.toString(this.f30648b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(LogBase.APP_VER, this.f30648b.a());
        bundle.putString("app_ver_name", this.f30648b.b());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String b10 = ((yl.j) vi.j.a(this.f30652f.a(false))).b();
            if (!TextUtils.isEmpty(b10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) vi.j.a(this.f30652f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        vl.f fVar = this.f30651e.get();
        um.i iVar = this.f30650d.get();
        if (fVar == null || iVar == null || (a10 = fVar.a("fire-iid")) == f.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(a10.a()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    public final vi.g<Bundle> i(String str, String str2, Bundle bundle) {
        try {
            h(str, str2, bundle);
            return this.f30649c.a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return vi.j.d(e10);
        }
    }

    public vi.g<?> j(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str2);
        return b(i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public vi.g<?> k(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String valueOf2 = String.valueOf(str2);
        return b(i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
