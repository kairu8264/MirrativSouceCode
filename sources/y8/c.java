package y8;

import java.util.List;
import jf.d0;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import oq.a;
import po.i;

/* loaded from: classes.dex */
public final class c implements oq.a {
    public i A;
    public i B;
    public i C;
    public i D;
    public final List<d> E;
    public final List<d> F;
    public final List<d> G;
    public final List<d> H;
    public final List<d> I;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f61281w;

    /* renamed from: x  reason: collision with root package name */
    public final int f61282x;

    /* renamed from: y  reason: collision with root package name */
    public final int f61283y;

    /* renamed from: z  reason: collision with root package name */
    public final int f61284z;

    /* loaded from: classes.dex */
    public enum a {
        Pr,
        Event,
        MyApp,
        OnliveApp
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61285a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.Pr.ordinal()] = 1;
            iArr[a.Event.ordinal()] = 2;
            iArr[a.MyApp.ordinal()] = 3;
            iArr[a.OnliveApp.ordinal()] = 4;
            f61285a = iArr;
        }
    }

    /* renamed from: y8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1041c extends q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f61286w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61287x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61288y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1041c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f61286w = aVar;
            this.f61287x = aVar2;
            this.f61288y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jf.d0] */
        @Override // io.a
        public final d0 invoke() {
            xq.a b10;
            oq.a aVar = this.f61286w;
            vq.a aVar2 = this.f61287x;
            io.a<? extends uq.a> aVar3 = this.f61288y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(d0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r8, java.util.List<y8.d> r9) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.<init>(android.content.Context, java.util.List):void");
    }

    public final int a() {
        return this.f61282x;
    }

    public final int b(int i10) {
        int size = this.H.size();
        boolean z10 = true;
        if (1 > size || size >= 3) {
            z10 = false;
        }
        return z10 ? Math.max(i10 - (this.f61283y * this.H.size()), 0) + (this.f61282x * 2) : this.f61282x;
    }

    public final List<d> c() {
        return this.I;
    }

    public final d0 d() {
        return (d0) this.f61281w.getValue();
    }

    public final int f() {
        return this.f61284z;
    }

    public final float g(a aVar, int i10, int i11) {
        i iVar;
        int k10;
        p.h(aVar, "appType");
        int i12 = b.f61285a[aVar.ordinal()];
        if (i12 == 1) {
            iVar = this.A;
        } else if (i12 == 2) {
            iVar = this.B;
        } else if (i12 == 3) {
            iVar = this.C;
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            iVar = this.D;
        }
        if (iVar.t(this.f61282x + i10)) {
            k10 = Math.min(this.f61282x, (iVar.m() - i11) - i10);
        } else {
            k10 = iVar.k() - i10;
        }
        return k10;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final int h(a aVar) {
        boolean isEmpty;
        p.h(aVar, "appType");
        int i10 = b.f61285a[aVar.ordinal()];
        if (i10 == 1) {
            isEmpty = this.E.isEmpty();
        } else if (i10 == 2) {
            isEmpty = this.F.isEmpty();
        } else if (i10 == 3) {
            isEmpty = this.G.isEmpty();
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            isEmpty = this.H.isEmpty();
        }
        return isEmpty ? 8 : 0;
    }

    public final boolean i(int i10) {
        if (i10 == this.E.size() - 1 || i10 == (this.E.size() + this.F.size()) - 1) {
            return true;
        }
        return !this.H.isEmpty() && i10 == (this.E.size() + this.F.size()) + this.G.size();
    }
}
