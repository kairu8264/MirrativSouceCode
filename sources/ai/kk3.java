package ai;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kk3 {

    /* renamed from: a */
    public final ArrayDeque<oh3> f6256a = new ArrayDeque<>();

    public /* synthetic */ kk3(lk3 lk3Var) {
    }

    public static /* synthetic */ oh3 a(kk3 kk3Var, oh3 oh3Var, oh3 oh3Var2) {
        kk3Var.b(oh3Var);
        kk3Var.b(oh3Var2);
        oh3 pop = kk3Var.f6256a.pop();
        while (!kk3Var.f6256a.isEmpty()) {
            pop = new nk3(kk3Var.f6256a.pop(), pop);
        }
        return pop;
    }

    public static final int c(int i10) {
        int binarySearch = Arrays.binarySearch(nk3.F, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public final void b(oh3 oh3Var) {
        oh3 oh3Var2;
        oh3 oh3Var3;
        if (oh3Var.u()) {
            int c10 = c(oh3Var.p());
            int W = nk3.W(c10 + 1);
            if (!this.f6256a.isEmpty() && this.f6256a.peek().p() < W) {
                int W2 = nk3.W(c10);
                oh3 pop = this.f6256a.pop();
                while (!this.f6256a.isEmpty() && this.f6256a.peek().p() < W2) {
                    pop = new nk3(this.f6256a.pop(), pop);
                }
                nk3 nk3Var = new nk3(pop, oh3Var);
                while (!this.f6256a.isEmpty()) {
                    if (this.f6256a.peek().p() >= nk3.W(c(nk3Var.p()) + 1)) {
                        break;
                    }
                    nk3Var = new nk3(this.f6256a.pop(), nk3Var);
                }
                this.f6256a.push(nk3Var);
                return;
            }
            this.f6256a.push(oh3Var);
        } else if (oh3Var instanceof nk3) {
            nk3 nk3Var2 = (nk3) oh3Var;
            oh3Var2 = nk3Var2.B;
            b(oh3Var2);
            oh3Var3 = nk3Var2.C;
            b(oh3Var3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(oh3Var.getClass())));
        }
    }
}
