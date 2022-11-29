package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y4.c;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<? extends Object>[] f14652a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f14653w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y4.c f14654x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f14655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, y4.c cVar, String str) {
            super(0);
            this.f14653w = z10;
            this.f14654x = cVar;
            this.f14655y = str;
        }

        public final void a() {
            if (this.f14653w) {
                this.f14654x.i(this.f14655y);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c.InterfaceC1040c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u0.f f14656a;

        public b(u0.f fVar) {
            this.f14656a = fVar;
        }

        @Override // y4.c.InterfaceC1040c
        public final Bundle a() {
            return t0.f(this.f14656a.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Object, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f14657w = new c();

        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            jo.p.h(obj, "it");
            return Boolean.valueOf(t0.e(obj));
        }
    }

    public static final s0 a(View view, y4.e eVar) {
        jo.p.h(view, "view");
        jo.p.h(eVar, "owner");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(x0.h.H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return b(str, eVar);
    }

    public static final s0 b(String str, y4.e eVar) {
        boolean z10;
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(eVar, "savedStateRegistryOwner");
        String str2 = u0.f.class.getSimpleName() + ':' + str;
        y4.c a02 = eVar.a0();
        Bundle b10 = a02.b(str2);
        u0.f a10 = u0.h.a(b10 != null ? g(b10) : null, c.f14657w);
        try {
            a02.g(str2, new b(a10));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new s0(a10, new a(z10, a02, str2));
    }

    public static final boolean e(Object obj) {
        if (obj instanceof v0.r) {
            v0.r rVar = (v0.r) obj;
            if (rVar.i() == l0.u1.h() || rVar.i() == l0.u1.n() || rVar.i() == l0.u1.k()) {
                T value = rVar.getValue();
                if (value == 0) {
                    return true;
                }
                return e(value);
            }
            return false;
        } else if ((obj instanceof wn.b) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : f14652a) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final Bundle f(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    public static final Map<String, List<Object>> g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        jo.p.g(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            jo.p.g(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
