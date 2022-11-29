package ai;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class d63 {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<c63> f3160a = new CopyOnWriteArrayList<>();

    public static c63 a(String str) throws GeneralSecurityException {
        Iterator<c63> it = f3160a.iterator();
        while (it.hasNext()) {
            c63 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
