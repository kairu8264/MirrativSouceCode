package yc;

import android.content.res.Resources;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import ha.a;
import io.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import po.n;
import uo.r0;
import wn.m;
import wn.v;
import xn.i0;
import xn.t;
import xo.r;
import xo.w;
import xo.y;
import yc.a;
import yc.c;

/* loaded from: classes2.dex */
public final class g extends q0 implements uo.q0 {
    public static final a M = new a(null);
    public static final int N = 8;
    public final /* synthetic */ uo.q0 A;
    public final List<yc.a> B;
    public final s0<yc.d> C;
    public final c2<yc.d> D;
    public final s0<String> E;
    public final c2<String> F;
    public final r<ChatStatus> G;
    public final w<ChatStatus> H;
    public final r<MRError> I;
    public final w<MRError> J;
    public final r<v> K;
    public final w<v> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f61669y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f61670z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerStore$on$1", f = "ChatConfirmationGenerationPickerStore.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61671w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.d f61673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c.d dVar, ao.d<? super b> dVar2) {
            super(2, dVar2);
            this.f61673y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f61673y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61671w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.G;
                ChatStatus a10 = this.f61673y.a();
                this.f61671w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerStore$on$2", f = "ChatConfirmationGenerationPickerStore.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61674w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c.b f61676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c.b bVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f61676y = bVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f61676y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61674w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.I;
                MRError a10 = this.f61676y.a();
                this.f61674w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.generationpicker.ChatConfirmationGenerationPickerStore$on$3", f = "ChatConfirmationGenerationPickerStore.kt", l = {131}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61677w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f61677w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = g.this.K;
                v vVar = v.f59242a;
                this.f61677w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public g(q8.a aVar, Resources resources) {
        s0<yc.d> e10;
        s0<String> e11;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f61669y = aVar;
        this.f61670z = resources;
        this.A = r0.b();
        aVar.b(this);
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        arrayList.add(new a.C1052a(1940));
        int i10 = calendar.get(1);
        po.i t10 = n.t(1941, i10);
        ArrayList arrayList2 = new ArrayList(t.u(t10, 10));
        Iterator<Integer> it = t10.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a.c(((i0) it).b()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new a.c(i10));
        calendar.add(1, -23);
        int indexOf = arrayList.indexOf(new a.c(calendar.get(1)));
        if (indexOf != -1) {
            arrayList.add(indexOf, a.b.f61617a);
        }
        this.B = arrayList;
        e10 = z1.e(n(), null, 2, null);
        this.C = e10;
        this.D = e10;
        e11 = z1.e(null, null, 2, null);
        this.E = e11;
        this.F = e11;
        r<ChatStatus> b10 = y.b(0, 0, null, 7, null);
        this.G = b10;
        this.H = b10;
        r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.I = b11;
        this.J = b11;
        r<v> b12 = y.b(0, 0, null, 7, null);
        this.K = b12;
        this.L = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f61669y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final c2<yc.d> i() {
        return this.D;
    }

    public final w<v> j() {
        return this.L;
    }

    public final w<MRError> k() {
        return this.J;
    }

    public final w<ChatStatus> l() {
        return this.H;
    }

    public final c2<String> m() {
        return this.F;
    }

    public final yc.d n() {
        String string;
        List<yc.a> list = this.B;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (yc.a aVar : list) {
            if (aVar instanceof a.C1052a) {
                string = this.f61670z.getString(nc.i.f41882n4, String.valueOf(((a.C1052a) aVar).a()));
            } else if (aVar instanceof a.c) {
                string = this.f61670z.getString(nc.i.f41886p4, String.valueOf(((a.c) aVar).a()));
            } else if (aVar instanceof a.b) {
                string = this.f61670z.getString(nc.i.f41884o4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(string);
        }
        return new yc.d(arrayList, this.B.indexOf(a.b.f61617a), false, a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.e eVar) {
        String str;
        jo.p.h(eVar, "event");
        s0<String> s0Var = this.E;
        yc.a aVar = this.B.get(eVar.a());
        if (aVar instanceof a.C1052a) {
            str = String.valueOf(((a.C1052a) aVar).a());
        } else if (aVar instanceof a.c) {
            str = String.valueOf(((a.c) aVar).a());
        } else if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = null;
        }
        s0Var.setValue(str);
        s0<yc.d> s0Var2 = this.C;
        s0Var2.setValue(yc.d.b(s0Var2.getValue(), null, eVar.a(), !(this.B.get(eVar.a()) instanceof a.b), null, 9, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.C1053c c1053c) {
        jo.p.h(c1053c, "event");
        s0<yc.d> s0Var = this.C;
        s0Var.setValue(yc.d.b(s0Var.getValue(), null, 0, false, a.b.f34695b, 7, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new b(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.b bVar) {
        jo.p.h(bVar, "event");
        s0<yc.d> s0Var = this.C;
        s0Var.setValue(yc.d.b(s0Var.getValue(), null, 0, false, a.d.f34697b, 7, null));
        uo.l.d(this, null, null, new c(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }
}
