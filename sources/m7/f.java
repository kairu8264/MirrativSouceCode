package m7;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import o7.u;

/* loaded from: classes.dex */
public class f<T> implements l<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Collection<? extends l<T>> f40611b;

    @SafeVarargs
    public f(l<T>... lVarArr) {
        if (lVarArr.length != 0) {
            this.f40611b = Arrays.asList(lVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        for (l<T> lVar : this.f40611b) {
            lVar.a(messageDigest);
        }
    }

    @Override // m7.l
    public u<T> b(Context context, u<T> uVar, int i10, int i11) {
        u<T> uVar2 = uVar;
        for (l<T> lVar : this.f40611b) {
            u<T> b10 = lVar.b(context, uVar2, i10, i11);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(b10)) {
                uVar2.c();
            }
            uVar2 = b10;
        }
        return uVar2;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f40611b.equals(((f) obj).f40611b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f40611b.hashCode();
    }

    public f(Collection<? extends l<T>> collection) {
        if (!collection.isEmpty()) {
            this.f40611b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
