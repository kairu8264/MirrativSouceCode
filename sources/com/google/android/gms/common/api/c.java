package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import oh.e;
import ph.d;
import ph.j;

@Deprecated
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<c> f27199a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes3.dex */
    public interface a extends d {
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface b extends j {
    }

    public <A extends a.b, R extends e, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }
}
