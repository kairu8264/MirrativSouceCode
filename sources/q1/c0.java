package q1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface c0 {

    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated
        public static int a(c0 c0Var, m mVar, List<? extends l> list, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(list, "measurables");
            return c0.super.a(mVar, list, i10);
        }

        @Deprecated
        public static int b(c0 c0Var, m mVar, List<? extends l> list, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(list, "measurables");
            return c0.super.d(mVar, list, i10);
        }

        @Deprecated
        public static int c(c0 c0Var, m mVar, List<? extends l> list, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(list, "measurables");
            return c0.super.e(mVar, list, i10);
        }

        @Deprecated
        public static int d(c0 c0Var, m mVar, List<? extends l> list, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(list, "measurables");
            return c0.super.g(mVar, list, i10);
        }
    }

    default int a(m mVar, List<? extends l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), n.Max, o.Height));
        }
        return c(new p(mVar, mVar.getLayoutDirection()), arrayList, m2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    d0 c(e0 e0Var, List<? extends b0> list, long j10);

    default int d(m mVar, List<? extends l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), n.Max, o.Width));
        }
        return c(new p(mVar, mVar.getLayoutDirection()), arrayList, m2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    default int e(m mVar, List<? extends l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), n.Min, o.Height));
        }
        return c(new p(mVar, mVar.getLayoutDirection()), arrayList, m2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int g(m mVar, List<? extends l> list, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h(list.get(i11), n.Min, o.Width));
        }
        return c(new p(mVar, mVar.getLayoutDirection()), arrayList, m2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
