package hi;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public static final s.a<String, Uri> f35782a = new s.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (g6.class) {
            s.a<String, Uri> aVar = f35782a;
            uri = aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
