package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class gt3 {

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<ft3> f4573g = ct3.f3036w;

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<ft3> f4574h = dt3.f3406w;

    /* renamed from: d  reason: collision with root package name */
    public int f4578d;

    /* renamed from: e  reason: collision with root package name */
    public int f4579e;

    /* renamed from: f  reason: collision with root package name */
    public int f4580f;

    /* renamed from: b  reason: collision with root package name */
    public final ft3[] f4576b = new ft3[5];

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ft3> f4575a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f4577c = -1;

    public gt3(int i10) {
    }

    public final void a() {
        this.f4575a.clear();
        this.f4577c = -1;
        this.f4578d = 0;
        this.f4579e = 0;
    }

    public final void b(int i10, float f10) {
        ft3 ft3Var;
        if (this.f4577c != 1) {
            Collections.sort(this.f4575a, f4573g);
            this.f4577c = 1;
        }
        int i11 = this.f4580f;
        if (i11 > 0) {
            ft3[] ft3VarArr = this.f4576b;
            int i12 = i11 - 1;
            this.f4580f = i12;
            ft3Var = ft3VarArr[i12];
        } else {
            ft3Var = new ft3(null);
        }
        int i13 = this.f4578d;
        this.f4578d = i13 + 1;
        ft3Var.f4201a = i13;
        ft3Var.f4202b = i10;
        ft3Var.f4203c = f10;
        this.f4575a.add(ft3Var);
        this.f4579e += i10;
        while (true) {
            int i14 = this.f4579e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            ft3 ft3Var2 = this.f4575a.get(0);
            int i16 = ft3Var2.f4202b;
            if (i16 <= i15) {
                this.f4579e -= i16;
                this.f4575a.remove(0);
                int i17 = this.f4580f;
                if (i17 < 5) {
                    ft3[] ft3VarArr2 = this.f4576b;
                    this.f4580f = i17 + 1;
                    ft3VarArr2[i17] = ft3Var2;
                }
            } else {
                ft3Var2.f4202b = i16 - i15;
                this.f4579e -= i15;
            }
        }
    }

    public final float c(float f10) {
        ArrayList<ft3> arrayList;
        if (this.f4577c != 0) {
            Collections.sort(this.f4575a, f4574h);
            this.f4577c = 0;
        }
        float f11 = this.f4579e * 0.5f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4575a.size(); i11++) {
            ft3 ft3Var = this.f4575a.get(i11);
            i10 += ft3Var.f4202b;
            if (i10 >= f11) {
                return ft3Var.f4203c;
            }
        }
        if (this.f4575a.isEmpty()) {
            return Float.NaN;
        }
        return this.f4575a.get(arrayList.size() - 1).f4203c;
    }
}
