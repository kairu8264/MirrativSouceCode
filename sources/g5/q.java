package g5;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import g5.m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q extends m {

    /* renamed from: i0  reason: collision with root package name */
    public int f32768i0;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList<m> f32766g0 = new ArrayList<>();

    /* renamed from: h0  reason: collision with root package name */
    public boolean f32767h0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f32769j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public int f32770k0 = 0;

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f32771a;

        public a(m mVar) {
            this.f32771a = mVar;
        }

        @Override // g5.m.f
        public void c(m mVar) {
            this.f32771a.a0();
            mVar.W(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public q f32773a;

        public b(q qVar) {
            this.f32773a = qVar;
        }

        @Override // g5.m.f
        public void c(m mVar) {
            q qVar = this.f32773a;
            int i10 = qVar.f32768i0 - 1;
            qVar.f32768i0 = i10;
            if (i10 == 0) {
                qVar.f32769j0 = false;
                qVar.t();
            }
            mVar.W(this);
        }

        @Override // g5.n, g5.m.f
        public void d(m mVar) {
            q qVar = this.f32773a;
            if (qVar.f32769j0) {
                return;
            }
            qVar.h0();
            this.f32773a.f32769j0 = true;
        }
    }

    @Override // g5.m
    public void T(View view) {
        super.T(view);
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).T(view);
        }
    }

    @Override // g5.m
    public void Y(View view) {
        super.Y(view);
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).Y(view);
        }
    }

    @Override // g5.m
    public void a0() {
        if (this.f32766g0.isEmpty()) {
            h0();
            t();
            return;
        }
        z0();
        if (!this.f32767h0) {
            for (int i10 = 1; i10 < this.f32766g0.size(); i10++) {
                this.f32766g0.get(i10 - 1).b(new a(this.f32766g0.get(i10)));
            }
            m mVar = this.f32766g0.get(0);
            if (mVar != null) {
                mVar.a0();
                return;
            }
            return;
        }
        Iterator<m> it = this.f32766g0.iterator();
        while (it.hasNext()) {
            it.next().a0();
        }
    }

    @Override // g5.m
    public void c0(m.e eVar) {
        super.c0(eVar);
        this.f32770k0 |= 8;
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).c0(eVar);
        }
    }

    @Override // g5.m
    public void cancel() {
        super.cancel();
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).cancel();
        }
    }

    @Override // g5.m
    public void e0(g gVar) {
        super.e0(gVar);
        this.f32770k0 |= 4;
        if (this.f32766g0 != null) {
            for (int i10 = 0; i10 < this.f32766g0.size(); i10++) {
                this.f32766g0.get(i10).e0(gVar);
            }
        }
    }

    @Override // g5.m
    public void f0(p pVar) {
        super.f0(pVar);
        this.f32770k0 |= 2;
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).f0(pVar);
        }
    }

    @Override // g5.m
    public void i(s sVar) {
        if (K(sVar.f32778b)) {
            Iterator<m> it = this.f32766g0.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.K(sVar.f32778b)) {
                    next.i(sVar);
                    sVar.f32779c.add(next);
                }
            }
        }
    }

    @Override // g5.m
    public String i0(String str) {
        String i02 = super.i0(str);
        for (int i10 = 0; i10 < this.f32766g0.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i02);
            sb2.append("\n");
            sb2.append(this.f32766g0.get(i10).i0(str + "  "));
            i02 = sb2.toString();
        }
        return i02;
    }

    @Override // g5.m
    /* renamed from: j0 */
    public q b(m.f fVar) {
        return (q) super.b(fVar);
    }

    @Override // g5.m
    public void l(s sVar) {
        super.l(sVar);
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32766g0.get(i10).l(sVar);
        }
    }

    @Override // g5.m
    /* renamed from: l0 */
    public q c(int i10) {
        for (int i11 = 0; i11 < this.f32766g0.size(); i11++) {
            this.f32766g0.get(i11).c(i10);
        }
        return (q) super.c(i10);
    }

    @Override // g5.m
    public void m(s sVar) {
        if (K(sVar.f32778b)) {
            Iterator<m> it = this.f32766g0.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.K(sVar.f32778b)) {
                    next.m(sVar);
                    sVar.f32779c.add(next);
                }
            }
        }
    }

    @Override // g5.m
    /* renamed from: m0 */
    public q e(View view) {
        for (int i10 = 0; i10 < this.f32766g0.size(); i10++) {
            this.f32766g0.get(i10).e(view);
        }
        return (q) super.e(view);
    }

    public q n0(m mVar) {
        o0(mVar);
        long j10 = this.f32749y;
        if (j10 >= 0) {
            mVar.b0(j10);
        }
        if ((this.f32770k0 & 1) != 0) {
            mVar.d0(w());
        }
        if ((this.f32770k0 & 2) != 0) {
            mVar.f0(A());
        }
        if ((this.f32770k0 & 4) != 0) {
            mVar.e0(z());
        }
        if ((this.f32770k0 & 8) != 0) {
            mVar.c0(v());
        }
        return this;
    }

    public final void o0(m mVar) {
        this.f32766g0.add(mVar);
        mVar.N = this;
    }

    public m p0(int i10) {
        if (i10 < 0 || i10 >= this.f32766g0.size()) {
            return null;
        }
        return this.f32766g0.get(i10);
    }

    @Override // g5.m
    /* renamed from: q */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.f32766g0 = new ArrayList<>();
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.o0(this.f32766g0.get(i10).clone());
        }
        return qVar;
    }

    public int q0() {
        return this.f32766g0.size();
    }

    @Override // g5.m
    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long C = C();
        int size = this.f32766g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.f32766g0.get(i10);
            if (C > 0 && (this.f32767h0 || i10 == 0)) {
                long C2 = mVar.C();
                if (C2 > 0) {
                    mVar.g0(C2 + C);
                } else {
                    mVar.g0(C);
                }
            }
            mVar.s(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // g5.m
    /* renamed from: s0 */
    public q W(m.f fVar) {
        return (q) super.W(fVar);
    }

    @Override // g5.m
    /* renamed from: t0 */
    public q X(View view) {
        for (int i10 = 0; i10 < this.f32766g0.size(); i10++) {
            this.f32766g0.get(i10).X(view);
        }
        return (q) super.X(view);
    }

    @Override // g5.m
    /* renamed from: u0 */
    public q b0(long j10) {
        ArrayList<m> arrayList;
        super.b0(j10);
        if (this.f32749y >= 0 && (arrayList = this.f32766g0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f32766g0.get(i10).b0(j10);
            }
        }
        return this;
    }

    @Override // g5.m
    /* renamed from: v0 */
    public q d0(TimeInterpolator timeInterpolator) {
        this.f32770k0 |= 1;
        ArrayList<m> arrayList = this.f32766g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f32766g0.get(i10).d0(timeInterpolator);
            }
        }
        return (q) super.d0(timeInterpolator);
    }

    public q w0(int i10) {
        if (i10 == 0) {
            this.f32767h0 = true;
        } else if (i10 == 1) {
            this.f32767h0 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    @Override // g5.m
    /* renamed from: y0 */
    public q g0(long j10) {
        return (q) super.g0(j10);
    }

    public final void z0() {
        b bVar = new b(this);
        Iterator<m> it = this.f32766g0.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.f32768i0 = this.f32766g0.size();
    }
}
