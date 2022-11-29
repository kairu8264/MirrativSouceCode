package u0;

import io.l;
import java.util.Arrays;
import java.util.Objects;
import jo.p;
import jo.q;
import l0.a0;
import l0.c0;
import l0.c2;
import l0.u1;
import l0.z;
import u0.f;
import v0.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f54220a = 36;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<a0, z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f54221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f54222x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<i<T, Object>> f54223y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<T> f54224z;

        /* renamed from: u0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0849a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f.a f54225a;

            public C0849a(f.a aVar) {
                this.f54225a = aVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f54225a.a();
            }
        }

        /* renamed from: u0.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0850b extends q implements io.a<Object> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c2<i<T, Object>> f54226w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c2<T> f54227x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ f f54228y;

            /* renamed from: u0.b$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0851a implements k {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ f f54229a;

                public C0851a(f fVar) {
                    this.f54229a = fVar;
                }

                @Override // u0.k
                public final boolean a(Object obj) {
                    p.h(obj, "it");
                    return this.f54229a.a(obj);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0850b(c2<? extends i<T, Object>> c2Var, c2<? extends T> c2Var2, f fVar) {
                super(0);
                this.f54226w = c2Var;
                this.f54227x = c2Var2;
                this.f54228y = fVar;
            }

            @Override // io.a
            public final Object invoke() {
                return ((i) this.f54226w.getValue()).b(new C0851a(this.f54228y), this.f54227x.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f fVar, String str, c2<? extends i<T, Object>> c2Var, c2<? extends T> c2Var2) {
            super(1);
            this.f54221w = fVar;
            this.f54222x = str;
            this.f54223y = c2Var;
            this.f54224z = c2Var2;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            p.h(a0Var, "$this$DisposableEffect");
            C0850b c0850b = new C0850b(this.f54223y, this.f54224z, this.f54221w);
            b.c(this.f54221w, c0850b.invoke());
            return new C0849a(this.f54221w.b(this.f54222x, c0850b));
        }
    }

    public static final <T> T b(Object[] objArr, i<T, ? extends Object> iVar, String str, io.a<? extends T> aVar, l0.i iVar2, int i10, int i11) {
        Object d10;
        p.h(objArr, "inputs");
        p.h(aVar, "init");
        iVar2.x(441892779);
        if ((i11 & 2) != 0) {
            iVar = j.b();
        }
        int i12 = i11 & 4;
        T t10 = null;
        if (i12 != 0) {
            str = null;
        }
        iVar2.x(1059366469);
        if (str == null || str.length() == 0) {
            str = Integer.toString(l0.h.a(iVar2, 0), so.a.a(f54220a));
            p.g(str, "toString(this, checkRadix(radix))");
        }
        iVar2.O();
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        f fVar = (f) iVar2.G(h.b());
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        iVar2.x(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= iVar2.P(obj);
        }
        T t11 = (T) iVar2.y();
        if (z10 || t11 == l0.i.f39065a.a()) {
            if (fVar != null && (d10 = fVar.d(str)) != null) {
                t10 = iVar.a(d10);
            }
            t11 = t10 == null ? aVar.invoke() : t10;
            iVar2.q(t11);
        }
        iVar2.O();
        if (fVar != null) {
            c0.b(fVar, str, new a(fVar, str, u1.l(iVar, iVar2, 0), u1.l(t11, iVar2, 0)), iVar2, 0);
        }
        iVar2.O();
        return t11;
    }

    public static final void c(f fVar, Object obj) {
        String str;
        if (obj == null || fVar.a(obj)) {
            return;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.i() == u1.h() || rVar.i() == u1.n() || rVar.i() == u1.k()) {
                str = "MutableState containing " + rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
