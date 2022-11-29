package r9;

import android.content.Context;
import android.graphics.Color;
import com.dena.mirrativ.mirrativapi.closet.GameEffect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: s  reason: collision with root package name */
    public static final a f50530s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f50531t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f50532a;

    /* renamed from: b  reason: collision with root package name */
    public final String f50533b;

    /* renamed from: c  reason: collision with root package name */
    public final String f50534c;

    /* renamed from: d  reason: collision with root package name */
    public final String f50535d;

    /* renamed from: e  reason: collision with root package name */
    public final String f50536e;

    /* renamed from: f  reason: collision with root package name */
    public final b f50537f;

    /* renamed from: g  reason: collision with root package name */
    public final b f50538g;

    /* renamed from: h  reason: collision with root package name */
    public final b f50539h;

    /* renamed from: i  reason: collision with root package name */
    public final b f50540i;

    /* renamed from: j  reason: collision with root package name */
    public final String f50541j;

    /* renamed from: k  reason: collision with root package name */
    public final String f50542k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f50543l;

    /* renamed from: m  reason: collision with root package name */
    public final String f50544m;

    /* renamed from: n  reason: collision with root package name */
    public final int f50545n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f50546o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f50547p;

    /* renamed from: q  reason: collision with root package name */
    public final String f50548q;

    /* renamed from: r  reason: collision with root package name */
    public final int f50549r;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ int f(a aVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = q9.d.f48820x;
            }
            return aVar.e(i10, i11);
        }

        public static /* synthetic */ int[] h(a aVar, Context context, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i11 = q9.d.f48820x;
            }
            return aVar.g(context, i10, i11);
        }

        public final w1 c(Context context, List<ud.q> list, ud.q qVar) {
            Object obj;
            Object obj2;
            GameEffect h10;
            GameEffect h11;
            GameEffect h12;
            GameEffect h13;
            GameEffect h14;
            GameEffect h15;
            String specDescription;
            GameEffect h16;
            String partTitle;
            GameEffect h17;
            String specDescription2;
            GameEffect h18;
            GameEffect h19;
            GameEffect h20;
            Integer m10;
            boolean z10;
            boolean z11;
            jo.p.h(context, "context");
            jo.p.h(list, "editingEquipments");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ud.q) obj).l() == jf.k0.MACHINE) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            ud.q qVar2 = (ud.q) obj;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((ud.q) obj2).l() == jf.k0.BOTH_WEAPON) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            ud.q qVar3 = (ud.q) obj2;
            int i10 = 0;
            for (ud.q qVar4 : list) {
                GameEffect h21 = qVar4.h();
                i10 += h21 != null ? h21.getPower() : 0;
            }
            int i11 = 0;
            for (ud.q qVar5 : list) {
                GameEffect h22 = qVar5.h();
                i11 += h22 != null ? h22.getWeight() : 0;
            }
            int i12 = 0;
            for (ud.q qVar6 : list) {
                GameEffect h23 = qVar6.h();
                i12 += h23 != null ? h23.getSpeed() : 0;
            }
            int i13 = 0;
            for (ud.q qVar7 : list) {
                GameEffect h24 = qVar7.h();
                i13 += h24 != null ? h24.getAccel() : 0;
            }
            int i14 = 0;
            for (ud.q qVar8 : list) {
                GameEffect h25 = qVar8.h();
                i14 += (int) ((h25 != null ? h25.getEffectValue() : 0.0f) * 100);
            }
            jf.k0 l10 = qVar != null ? qVar.l() : null;
            jf.k0 k0Var = jf.k0.MACHINE;
            int power = (l10 == k0Var || qVar == null || (h10 = qVar.h()) == null) ? 0 : h10.getPower();
            int weight = ((qVar != null ? qVar.l() : null) == k0Var || qVar == null || (h11 = qVar.h()) == null) ? 0 : h11.getWeight();
            int speed = ((qVar != null ? qVar.l() : null) == k0Var || qVar == null || (h12 = qVar.h()) == null) ? 0 : h12.getSpeed();
            int accel = ((qVar != null ? qVar.l() : null) == k0Var || qVar == null || (h13 = qVar.h()) == null) ? 0 : h13.getAccel();
            int effectValue = (qVar != null ? qVar.l() : null) == k0Var ? 0 : (int) (((qVar == null || (h14 = qVar.h()) == null) ? 0.0f : h14.getEffectValue()) * 100);
            int intValue = (qVar2 == null || (m10 = qVar2.m()) == null) ? 0 : m10.intValue();
            String str = (qVar2 == null || (h20 = qVar2.h()) == null || (str = h20.getPartTitle()) == null) ? "" : "";
            String str2 = (qVar2 == null || (h19 = qVar2.h()) == null || (str2 = h19.getPartSubTitle()) == null) ? "" : "";
            String str3 = (qVar2 == null || (h18 = qVar2.h()) == null || (str3 = h18.getSpecTitle()) == null) ? "" : "";
            String str4 = (qVar2 == null || (h17 = qVar2.h()) == null || (specDescription2 = h17.getSpecDescription()) == null) ? "" : specDescription2;
            b.a aVar = b.f50550i;
            b a10 = aVar.a(context, i10, power, 100);
            b a11 = aVar.a(context, i11, weight, 50);
            b a12 = aVar.a(context, i12, speed, 50);
            b a13 = aVar.a(context, i13, accel, 50);
            String str5 = (qVar3 == null || (h16 = qVar3.h()) == null || (partTitle = h16.getPartTitle()) == null) ? "" : partTitle;
            String str6 = (qVar3 == null || (h15 = qVar3.h()) == null || (specDescription = h15.getSpecDescription()) == null) ? "" : specDescription;
            boolean z12 = qVar3 != null;
            int i15 = q9.i.text_shooter_dress_bonus;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14);
            sb2.append('%');
            String string = context.getString(i15, sb2.toString());
            jo.p.g(string, "context.getString(R.stri…ss_bonus, \"$scoreBonus%\")");
            int d10 = c3.a.d(context, f(this, effectValue, 0, 2, null));
            boolean z13 = i14 != 0;
            boolean z14 = effectValue != 0;
            int i16 = q9.i.text_shooter_up;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(effectValue);
            sb3.append('%');
            String string2 = context.getString(i16, sb3.toString());
            jo.p.g(string2, "context.getString(R.stri… \"$scoreBonusDiffValue%\")");
            return new w1(intValue, str, str2, str3, str4, a10, a11, a12, a13, str5, str6, z12, string, d10, z13, z14, string2, c3.a.d(context, f(this, effectValue, 0, 2, null)));
        }

        public final String d(int i10) {
            if (i10 <= 0) {
                return i10 < 0 ? String.valueOf(i10) : "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            sb2.append(i10);
            return sb2.toString();
        }

        public final int e(int i10, int i11) {
            if (i10 > 0) {
                return q9.d.f48809m;
            }
            return i10 < 0 ? q9.d.warmBlue : i11;
        }

        public final int[] g(Context context, int i10, int i11) {
            return i10 > 0 ? new int[]{Color.parseColor("#FFCD00"), c3.a.d(context, q9.d.f48809m)} : i10 < 0 ? new int[]{Color.parseColor("#29CCCB"), c3.a.d(context, q9.d.warmBlue)} : new int[]{c3.a.d(context, i11), c3.a.d(context, i11)};
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i  reason: collision with root package name */
        public static final a f50550i = new a(null);

        /* renamed from: j  reason: collision with root package name */
        public static final int f50551j = 8;

        /* renamed from: a  reason: collision with root package name */
        public final String f50552a;

        /* renamed from: b  reason: collision with root package name */
        public final int f50553b;

        /* renamed from: c  reason: collision with root package name */
        public final int f50554c;

        /* renamed from: d  reason: collision with root package name */
        public final float f50555d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f50556e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f50557f;

        /* renamed from: g  reason: collision with root package name */
        public final String f50558g;

        /* renamed from: h  reason: collision with root package name */
        public final int f50559h;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final b a(Context context, int i10, int i11, int i12) {
                jo.p.h(context, "context");
                String valueOf = String.valueOf(i10);
                a aVar = w1.f50530s;
                return new b(valueOf, c3.a.d(context, aVar.e(i11, q9.d.f48806d)), i11 != 0 ? 1 : 0, (i10 * 1.0f) / i12, a.h(aVar, context, i11, 0, 4, null), i11 != 0, aVar.d(i11), c3.a.d(context, a.f(aVar, i11, 0, 2, null)));
            }
        }

        public b(String str, int i10, int i11, float f10, int[] iArr, boolean z10, String str2, int i12) {
            jo.p.h(str, "valueText");
            jo.p.h(str2, "changeValueText");
            this.f50552a = str;
            this.f50553b = i10;
            this.f50554c = i11;
            this.f50555d = f10;
            this.f50556e = iArr;
            this.f50557f = z10;
            this.f50558g = str2;
            this.f50559h = i12;
        }

        public final String a() {
            return this.f50558g;
        }

        public final int[] b() {
            return this.f50556e;
        }

        public final float c() {
            return this.f50555d;
        }

        public final int d() {
            return this.f50559h;
        }

        public final String e() {
            return this.f50552a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f50552a, bVar.f50552a) && this.f50553b == bVar.f50553b && this.f50554c == bVar.f50554c && jo.p.c(Float.valueOf(this.f50555d), Float.valueOf(bVar.f50555d)) && jo.p.c(this.f50556e, bVar.f50556e) && this.f50557f == bVar.f50557f && jo.p.c(this.f50558g, bVar.f50558g) && this.f50559h == bVar.f50559h;
            }
            return false;
        }

        public final int f() {
            return this.f50553b;
        }

        public final int g() {
            return this.f50554c;
        }

        public final boolean h() {
            return this.f50557f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.f50552a.hashCode() * 31) + Integer.hashCode(this.f50553b)) * 31) + Integer.hashCode(this.f50554c)) * 31) + Float.hashCode(this.f50555d)) * 31;
            int[] iArr = this.f50556e;
            int hashCode2 = (hashCode + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
            boolean z10 = this.f50557f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return ((((hashCode2 + i10) * 31) + this.f50558g.hashCode()) * 31) + Integer.hashCode(this.f50559h);
        }

        public String toString() {
            return "ParameterBindModel(valueText=" + this.f50552a + ", valueTextForegroundColorInt=" + this.f50553b + ", valueTextStyle=" + this.f50554c + ", gaugeProgress=" + this.f50555d + ", gaugeGradientColor=" + Arrays.toString(this.f50556e) + ", isVisibleValueChangePopup=" + this.f50557f + ", changeValueText=" + this.f50558g + ", popupBackgroundColorInt=" + this.f50559h + ')';
        }
    }

    public w1(int i10, String str, String str2, String str3, String str4, b bVar, b bVar2, b bVar3, b bVar4, String str5, String str6, boolean z10, String str7, int i11, boolean z11, boolean z12, String str8, int i12) {
        jo.p.h(str, "machineNameText");
        jo.p.h(str2, "weaponNameText");
        jo.p.h(str3, "specNameText");
        jo.p.h(str4, "specDescriptionText");
        jo.p.h(bVar, "powerParam");
        jo.p.h(bVar2, "weightParam");
        jo.p.h(bVar3, "speedParam");
        jo.p.h(bVar4, "accelParam");
        jo.p.h(str5, "itemNameText");
        jo.p.h(str6, "itemDescriptionText");
        jo.p.h(str7, "costumeEffectText");
        jo.p.h(str8, "costumeChangeValueText");
        this.f50532a = i10;
        this.f50533b = str;
        this.f50534c = str2;
        this.f50535d = str3;
        this.f50536e = str4;
        this.f50537f = bVar;
        this.f50538g = bVar2;
        this.f50539h = bVar3;
        this.f50540i = bVar4;
        this.f50541j = str5;
        this.f50542k = str6;
        this.f50543l = z10;
        this.f50544m = str7;
        this.f50545n = i11;
        this.f50546o = z11;
        this.f50547p = z12;
        this.f50548q = str8;
        this.f50549r = i12;
    }

    public final b a() {
        return this.f50540i;
    }

    public final String b() {
        return this.f50548q;
    }

    public final String c() {
        return this.f50544m;
    }

    public final int d() {
        return this.f50545n;
    }

    public final int e() {
        return this.f50549r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return this.f50532a == w1Var.f50532a && jo.p.c(this.f50533b, w1Var.f50533b) && jo.p.c(this.f50534c, w1Var.f50534c) && jo.p.c(this.f50535d, w1Var.f50535d) && jo.p.c(this.f50536e, w1Var.f50536e) && jo.p.c(this.f50537f, w1Var.f50537f) && jo.p.c(this.f50538g, w1Var.f50538g) && jo.p.c(this.f50539h, w1Var.f50539h) && jo.p.c(this.f50540i, w1Var.f50540i) && jo.p.c(this.f50541j, w1Var.f50541j) && jo.p.c(this.f50542k, w1Var.f50542k) && this.f50543l == w1Var.f50543l && jo.p.c(this.f50544m, w1Var.f50544m) && this.f50545n == w1Var.f50545n && this.f50546o == w1Var.f50546o && this.f50547p == w1Var.f50547p && jo.p.c(this.f50548q, w1Var.f50548q) && this.f50549r == w1Var.f50549r;
        }
        return false;
    }

    public final String f() {
        return this.f50542k;
    }

    public final String g() {
        return this.f50541j;
    }

    public final String h() {
        return this.f50533b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((Integer.hashCode(this.f50532a) * 31) + this.f50533b.hashCode()) * 31) + this.f50534c.hashCode()) * 31) + this.f50535d.hashCode()) * 31) + this.f50536e.hashCode()) * 31) + this.f50537f.hashCode()) * 31) + this.f50538g.hashCode()) * 31) + this.f50539h.hashCode()) * 31) + this.f50540i.hashCode()) * 31) + this.f50541j.hashCode()) * 31) + this.f50542k.hashCode()) * 31;
        boolean z10 = this.f50543l;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.f50544m.hashCode()) * 31) + Integer.hashCode(this.f50545n)) * 31;
        boolean z11 = this.f50546o;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f50547p;
        return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f50548q.hashCode()) * 31) + Integer.hashCode(this.f50549r);
    }

    public final b i() {
        return this.f50537f;
    }

    public final int j() {
        return this.f50532a;
    }

    public final String k() {
        return this.f50536e;
    }

    public final String l() {
        return this.f50535d;
    }

    public final b m() {
        return this.f50539h;
    }

    public final String n() {
        return this.f50534c;
    }

    public final b o() {
        return this.f50538g;
    }

    public final boolean p() {
        return this.f50546o;
    }

    public final boolean q() {
        return this.f50547p;
    }

    public final boolean r() {
        return this.f50543l;
    }

    public String toString() {
        return "ShooterDressUpDetailBindModel(rarity=" + this.f50532a + ", machineNameText=" + this.f50533b + ", weaponNameText=" + this.f50534c + ", specNameText=" + this.f50535d + ", specDescriptionText=" + this.f50536e + ", powerParam=" + this.f50537f + ", weightParam=" + this.f50538g + ", speedParam=" + this.f50539h + ", accelParam=" + this.f50540i + ", itemNameText=" + this.f50541j + ", itemDescriptionText=" + this.f50542k + ", isVisibleItemDescription=" + this.f50543l + ", costumeEffectText=" + this.f50544m + ", costumeEffectTextForegroundColorInt=" + this.f50545n + ", isVisibleCostumeEffectText=" + this.f50546o + ", isVisibleCostumeValueChangePopup=" + this.f50547p + ", costumeChangeValueText=" + this.f50548q + ", costumePopupBackgroundColorInt=" + this.f50549r + ')';
    }
}
