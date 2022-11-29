package hi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a0 extends x {
    public a0() {
        this.f36056a.add(n0.APPLY);
        this.f36056a.add(n0.BLOCK);
        this.f36056a.add(n0.BREAK);
        this.f36056a.add(n0.CASE);
        this.f36056a.add(n0.DEFAULT);
        this.f36056a.add(n0.CONTINUE);
        this.f36056a.add(n0.DEFINE_FUNCTION);
        this.f36056a.add(n0.FN);
        this.f36056a.add(n0.IF);
        this.f36056a.add(n0.QUOTE);
        this.f36056a.add(n0.RETURN);
        this.f36056a.add(n0.SWITCH);
        this.f36056a.add(n0.TERNARY);
    }

    public static q c(u4 u4Var, List<q> list) {
        v5.i(n0.FN.name(), 2, list);
        q b10 = u4Var.b(list.get(0));
        q b11 = u4Var.b(list.get(1));
        if (b11 instanceof f) {
            List<q> w10 = ((f) b11).w();
            List<q> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new p(b10.h(), w10, arrayList, u4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b11.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // hi.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hi.q a(java.lang.String r8, hi.u4 r9, java.util.List<hi.q> r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.a0.a(java.lang.String, hi.u4, java.util.List):hi.q");
    }
}
