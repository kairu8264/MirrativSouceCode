package y1;

import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public static final int a(List<i> list, int i10) {
        char c10;
        jo.p.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            i iVar = list.get(i12);
            if (iVar.f() > i10) {
                c10 = 1;
            } else {
                c10 = iVar.b() <= i10 ? (char) 65535 : (char) 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int b(List<i> list, int i10) {
        char c10;
        jo.p.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            i iVar = list.get(i12);
            if (iVar.g() > i10) {
                c10 = 1;
            } else {
                c10 = iVar.c() <= i10 ? (char) 65535 : (char) 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List<i> list, float f10) {
        char c10;
        jo.p.h(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            i iVar = list.get(i11);
            if (iVar.h() > f10) {
                c10 = 1;
            } else {
                c10 = iVar.a() <= f10 ? (char) 65535 : (char) 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 <= 0) {
                return i11;
            } else {
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }
}
