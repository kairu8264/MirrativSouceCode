package xn;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class u0 {

    @co.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.k implements io.p<ro.i<? super List<? extends T>>, ao.d<? super wn.v>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ Iterator<T> E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;

        /* renamed from: x  reason: collision with root package name */
        public Object f60460x;

        /* renamed from: y  reason: collision with root package name */
        public Object f60461y;

        /* renamed from: z  reason: collision with root package name */
        public int f60462z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, ao.d<? super a> dVar) {
            super(2, dVar);
            this.C = i10;
            this.D = i11;
            this.E = it;
            this.F = z10;
            this.G = z11;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(ro.i<? super List<? extends T>> iVar, ao.d<? super wn.v> dVar) {
            return ((a) create(iVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.C, this.D, this.E, this.F, this.G, dVar);
            aVar.B = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xn.u0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        jo.p.h(it, "iterator");
        return !it.hasNext() ? b0.f60429w : ro.j.a(new a(i10, i11, it, z11, z10, null));
    }
}
