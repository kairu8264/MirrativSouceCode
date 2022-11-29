package xc;

import android.content.res.Resources;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import io.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import so.o;
import uo.r0;
import wn.m;
import wn.v;
import xc.b;
import xn.a0;
import xn.t;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class h extends q0 implements uo.q0 {
    public final /* synthetic */ uo.q0 A;
    public final List<Integer> B;
    public final List<Integer> C;
    public final s0<xc.c> D;
    public final c2<xc.c> E;
    public final s0<String> F;
    public final c2<String> G;
    public final r<ChatStatus> H;
    public final w<ChatStatus> I;
    public final r<MRError> J;
    public final w<MRError> K;
    public final r<v> L;
    public final w<v> M;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f60188y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f60189z;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerStore$on$1", f = "ChatConfirmationDatePickerStore.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60190w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.d f60192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.d dVar, ao.d<? super a> dVar2) {
            super(2, dVar2);
            this.f60192y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f60192y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f60190w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = h.this.H;
                ChatStatus a10 = this.f60192y.a();
                this.f60190w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerStore$on$2", f = "ChatConfirmationDatePickerStore.kt", l = {144}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60193w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.C0999b f60195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.C0999b c0999b, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f60195y = c0999b;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f60195y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f60193w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = h.this.J;
                MRError a10 = this.f60195y.a();
                this.f60193w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerStore$on$3", f = "ChatConfirmationDatePickerStore.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60196w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f60196w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = h.this.L;
                v vVar = v.f59242a;
                this.f60196w = 1;
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

    public h(q8.a aVar, Resources resources) {
        s0<xc.c> e10;
        s0<String> e11;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f60188y = aVar;
        this.f60189z = resources;
        this.A = r0.b();
        aVar.b(this);
        this.B = a0.B0(new po.i(1, 12));
        this.C = a0.B0(new po.i(1, 31));
        e10 = z1.e(n(), null, 2, null);
        this.D = e10;
        this.E = e10;
        e11 = z1.e("0101", null, 2, null);
        this.F = e11;
        this.G = e11;
        r<ChatStatus> b10 = y.b(0, 0, null, 7, null);
        this.H = b10;
        this.I = b10;
        r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.J = b11;
        this.K = b11;
        r<v> b12 = y.b(0, 0, null, 7, null);
        this.L = b12;
        this.M = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f60188y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final c2<xc.c> i() {
        return this.E;
    }

    public final w<v> j() {
        return this.M;
    }

    public final c2<String> k() {
        return this.G;
    }

    public final w<MRError> l() {
        return this.K;
    }

    public final w<ChatStatus> m() {
        return this.I;
    }

    public final xc.c n() {
        List<Integer> list = this.B;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (Number number : list) {
            String string = this.f60189z.getString(nc.i.text_chat_confirmation_date_picker_month, String.valueOf(number.intValue()));
            jo.p.g(string, "resources.getString(R.st…ker_month, it.toString())");
            arrayList.add(string);
        }
        List<Integer> list2 = this.C;
        ArrayList arrayList2 = new ArrayList(t.u(list2, 10));
        for (Number number2 : list2) {
            String string2 = this.f60189z.getString(nc.i.text_chat_confirmation_date_picker_day, String.valueOf(number2.intValue()));
            jo.p.g(string2, "resources.getString(R.st…icker_day, it.toString())");
            arrayList2.add(string2);
        }
        return new xc.c(arrayList, arrayList2, 0, 0, true, a.d.f34697b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.f fVar) {
        boolean z10;
        jo.p.h(fVar, "event");
        xc.c value = this.D.getValue();
        int intValue = this.B.get(fVar.a()).intValue();
        int intValue2 = this.C.get(value.f()).intValue();
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
            calendar.clear(10);
            calendar.clear(12);
            calendar.clear(13);
            calendar.clear(14);
            calendar.set(1, 2020);
            calendar.set(2, intValue - 1);
            calendar.set(5, intValue2);
            calendar.setLenient(false);
            calendar.getTime();
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        this.F.setValue(o.e0(String.valueOf(intValue), 2, '0') + o.e0(String.valueOf(intValue2), 2, '0'));
        this.D.setValue(xc.c.b(value, null, null, fVar.a(), 0, z10, null, 43, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        boolean z10;
        jo.p.h(eVar, "event");
        xc.c value = this.D.getValue();
        int intValue = this.B.get(value.g()).intValue();
        int intValue2 = this.C.get(eVar.a()).intValue();
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
            calendar.clear(10);
            calendar.clear(12);
            calendar.clear(13);
            calendar.clear(14);
            calendar.set(1, 2020);
            calendar.set(2, intValue - 1);
            calendar.set(5, intValue2);
            calendar.setLenient(false);
            calendar.getTime();
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        this.F.setValue(o.e0(String.valueOf(intValue), 2, '0') + o.e0(String.valueOf(intValue2), 2, '0'));
        this.D.setValue(xc.c.b(value, null, null, 0, eVar.a(), z10, null, 39, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        s0<xc.c> s0Var = this.D;
        s0Var.setValue(xc.c.b(s0Var.getValue(), null, null, 0, 0, false, a.b.f34695b, 31, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new a(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0999b c0999b) {
        jo.p.h(c0999b, "event");
        s0<xc.c> s0Var = this.D;
        s0Var.setValue(xc.c.b(s0Var.getValue(), null, null, 0, 0, false, a.d.f34697b, 31, null));
        uo.l.d(this, null, null, new b(c0999b, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }
}
