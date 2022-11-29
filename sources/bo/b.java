package bo;

import ao.d;
import ao.g;
import co.h;
import co.j;
import io.p;
import jo.j0;
import wn.m;
import wn.v;

/* loaded from: classes4.dex */
public class b {

    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: w  reason: collision with root package name */
        public int f18549w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p f18550x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object f18551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f18550x = pVar;
            this.f18551y = obj;
            jo.p.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // co.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f18549w;
            if (i10 == 0) {
                this.f18549w = 1;
                m.b(obj);
                jo.p.f(this.f18550x, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) j0.e(this.f18550x, 2)).invoke(this.f18551y, this);
            } else if (i10 == 1) {
                this.f18549w = 2;
                m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: bo.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0132b extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public int f18552w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p f18553x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object f18554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0132b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f18553x = pVar;
            this.f18554y = obj;
            jo.p.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // co.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f18552w;
            if (i10 == 0) {
                this.f18552w = 1;
                m.b(obj);
                jo.p.f(this.f18553x, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) j0.e(this.f18553x, 2)).invoke(this.f18554y, this);
            } else if (i10 == 1) {
                this.f18552w = 2;
                m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final <R, T> d<v> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        jo.p.h(pVar, "<this>");
        jo.p.h(dVar, "completion");
        d<?> a10 = h.a(dVar);
        if (pVar instanceof co.a) {
            return ((co.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        if (context == ao.h.f16651w) {
            return new a(a10, pVar, r10);
        }
        return new C0132b(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> b(d<? super T> dVar) {
        d<T> dVar2;
        jo.p.h(dVar, "<this>");
        co.d dVar3 = dVar instanceof co.d ? (co.d) dVar : null;
        return (dVar3 == null || (dVar2 = (d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
