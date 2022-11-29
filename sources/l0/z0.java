package l0;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f39333a;

    public z0(List<Integer> list) {
        jo.p.h(list, "list");
        this.f39333a = list;
    }

    public final void a(int i10) {
        List<Integer> list;
        if (!this.f39333a.isEmpty()) {
            if (this.f39333a.get(0).intValue() == i10) {
                return;
            }
            if (this.f39333a.get(list.size() - 1).intValue() == i10) {
                return;
            }
        }
        int size = this.f39333a.size();
        this.f39333a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = this.f39333a.get(i11).intValue();
            if (i10 <= intValue) {
                break;
            }
            this.f39333a.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        this.f39333a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f39333a.isEmpty();
    }

    public final int c() {
        return ((Number) xn.a0.X(this.f39333a)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d() {
        int intValue;
        if (this.f39333a.size() > 0) {
            int intValue2 = this.f39333a.get(0).intValue();
            while ((!this.f39333a.isEmpty()) && this.f39333a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f39333a;
                list.set(0, xn.a0.i0(list));
                List<Integer> list2 = this.f39333a;
                list2.remove(list2.size() - 1);
                int size = this.f39333a.size();
                int size2 = this.f39333a.size() >>> 1;
                int i10 = 0;
                while (i10 < size2) {
                    int intValue3 = this.f39333a.get(i10).intValue();
                    int i11 = (i10 + 1) * 2;
                    int i12 = i11 - 1;
                    int intValue4 = this.f39333a.get(i12).intValue();
                    if (i11 >= size || (intValue = this.f39333a.get(i11).intValue()) <= intValue4) {
                        if (intValue4 > intValue3) {
                            this.f39333a.set(i10, Integer.valueOf(intValue4));
                            this.f39333a.set(i12, Integer.valueOf(intValue3));
                            i10 = i12;
                        }
                    } else if (intValue > intValue3) {
                        this.f39333a.set(i10, Integer.valueOf(intValue));
                        this.f39333a.set(i11, Integer.valueOf(intValue3));
                        i10 = i11;
                    }
                }
            }
            return intValue2;
        }
        k.x("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ z0(List list, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
