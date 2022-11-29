package o2;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.u;
import io.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import l0.a0;
import l0.z;
import s1.c0;
import u0.f;
import w1.y;
import wn.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final io.l<View, v> f43850a = m.f43873w;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<s1.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f43851w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a aVar) {
            super(0);
            this.f43851w = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, s1.k] */
        @Override // io.a
        public final s1.k invoke() {
            return this.f43851w.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<s1.k> {
        public final /* synthetic */ u0.f A;
        public final /* synthetic */ String B;
        public final /* synthetic */ c0<o2.f<T>> C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f43852w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.m f43853x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m1.b f43854y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<Context, T> f43855z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, l0.m mVar, m1.b bVar, io.l<? super Context, ? extends T> lVar, u0.f fVar, String str, c0<o2.f<T>> c0Var) {
            super(0);
            this.f43852w = context;
            this.f43853x = mVar;
            this.f43854y = bVar;
            this.f43855z = lVar;
            this.A = fVar;
            this.B = str;
            this.C = c0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final s1.k invoke() {
            View typedView$ui_release;
            o2.f fVar = new o2.f(this.f43852w, this.f43853x, this.f43854y);
            fVar.setFactory(this.f43855z);
            u0.f fVar2 = this.A;
            Object d10 = fVar2 != null ? fVar2.d(this.B) : null;
            SparseArray<Parcelable> sparseArray = d10 instanceof SparseArray ? (SparseArray) d10 : null;
            if (sparseArray != null && (typedView$ui_release = fVar.getTypedView$ui_release()) != null) {
                typedView$ui_release.restoreHierarchyState(sparseArray);
            }
            this.C.b(fVar);
            return fVar.getLayoutNode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<s1.k, x0.f, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43856w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43856w = c0Var;
        }

        public final void a(s1.k kVar, x0.f fVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(fVar, "it");
            Object a10 = this.f43856w.a();
            jo.p.e(a10);
            ((o2.f) a10).setModifier(fVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, x0.f fVar) {
            a(kVar, fVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements p<s1.k, m2.d, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43857w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43857w = c0Var;
        }

        public final void a(s1.k kVar, m2.d dVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(dVar, "it");
            Object a10 = this.f43857w.a();
            jo.p.e(a10);
            ((o2.f) a10).setDensity(dVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, m2.d dVar) {
            a(kVar, dVar);
            return v.f59242a;
        }
    }

    /* renamed from: o2.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0647e extends q implements p<s1.k, u, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43858w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0647e(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43858w = c0Var;
        }

        public final void a(s1.k kVar, u uVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(uVar, "it");
            Object a10 = this.f43858w.a();
            jo.p.e(a10);
            ((o2.f) a10).setLifecycleOwner(uVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, u uVar) {
            a(kVar, uVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements p<s1.k, y4.e, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43859w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43859w = c0Var;
        }

        public final void a(s1.k kVar, y4.e eVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(eVar, "it");
            Object a10 = this.f43859w.a();
            jo.p.e(a10);
            ((o2.f) a10).setSavedStateRegistryOwner(eVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, y4.e eVar) {
            a(kVar, eVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements p<s1.k, io.l<? super T, ? extends v>, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43860w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43860w = c0Var;
        }

        public final void a(s1.k kVar, io.l<? super T, v> lVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(lVar, "it");
            Object a10 = this.f43860w.a();
            jo.p.e(a10);
            ((o2.f) a10).setUpdateBlock(lVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, Object obj) {
            a(kVar, (io.l) obj);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements p<s1.k, m2.q, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43861w;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f43862a;

            static {
                int[] iArr = new int[m2.q.values().length];
                iArr[m2.q.Ltr.ordinal()] = 1;
                iArr[m2.q.Rtl.ordinal()] = 2;
                f43862a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c0<o2.f<T>> c0Var) {
            super(2);
            this.f43861w = c0Var;
        }

        public final void a(s1.k kVar, m2.q qVar) {
            jo.p.h(kVar, "$this$set");
            jo.p.h(qVar, "it");
            Object a10 = this.f43861w.a();
            jo.p.e(a10);
            o2.f fVar = (o2.f) a10;
            int i10 = a.f43862a[qVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.setLayoutDirection(i11);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(s1.k kVar, m2.q qVar) {
            a(kVar, qVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.l<a0, z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ u0.f f43863w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f43864x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c0<o2.f<T>> f43865y;

        /* loaded from: classes.dex */
        public static final class a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f.a f43866a;

            public a(f.a aVar) {
                this.f43866a = aVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f43866a.a();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.a<SparseArray<Parcelable>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c0<o2.f<T>> f43867w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c0<o2.f<T>> c0Var) {
                super(0);
                this.f43867w = c0Var;
            }

            @Override // io.a
            /* renamed from: a */
            public final SparseArray<Parcelable> invoke() {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                Object a10 = this.f43867w.a();
                jo.p.e(a10);
                View typedView$ui_release = ((o2.f) a10).getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    typedView$ui_release.saveHierarchyState(sparseArray);
                }
                return sparseArray;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(u0.f fVar, String str, c0<o2.f<T>> c0Var) {
            super(1);
            this.f43863w = fVar;
            this.f43864x = str;
            this.f43865y = c0Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final z invoke(a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f43863w.b(this.f43864x, new b(this.f43865y)));
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Context, T> f43868w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f43869x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<T, v> f43870y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f43871z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(io.l<? super Context, ? extends T> lVar, x0.f fVar, io.l<? super T, v> lVar2, int i10, int i11) {
            super(2);
            this.f43868w = lVar;
            this.f43869x = fVar;
            this.f43870y = lVar2;
            this.f43871z = i10;
            this.A = i11;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f43868w, this.f43869x, this.f43870y, iVar, this.f43871z | 1, this.A);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.l<y, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f43872w = new k();

        public k() {
            super(1);
        }

        public final void a(y yVar) {
            jo.p.h(yVar, "$this$semantics");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l implements m1.a {
    }

    /* loaded from: classes.dex */
    public static final class m extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f43873w = new m();

        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "$this$null");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends android.view.View> void a(io.l<? super android.content.Context, ? extends T> r17, x0.f r18, io.l<? super T, wn.v> r19, l0.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.e.a(io.l, x0.f, io.l, l0.i, int, int):void");
    }

    public static final io.l<View, v> b() {
        return f43850a;
    }
}
