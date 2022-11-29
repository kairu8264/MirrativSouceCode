package ud;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoQuestItemAttribute;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGameEffectType;
import kotlin.NoWhenBranchMatchedException;
import ud.r0;

/* loaded from: classes2.dex */
public final class t0 implements r0 {
    public final String A;
    public final r0.a B;
    public final boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final int f55504w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55505x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55506y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f55507z;
    public static final a D = new a(null);
    public static final Parcelable.Creator<t0> CREATOR = new b();
    public static final int E = 8;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.t0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0868a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f55508a;

            static {
                int[] iArr = new int[EmomoQuestGameEffectType.values().length];
                iArr[EmomoQuestGameEffectType.HIT_POINT.ordinal()] = 1;
                iArr[EmomoQuestGameEffectType.POWER.ordinal()] = 2;
                iArr[EmomoQuestGameEffectType.SPEED.ordinal()] = 3;
                iArr[EmomoQuestGameEffectType.DECREASE_SPEED.ordinal()] = 4;
                iArr[EmomoQuestGameEffectType.JUMP.ordinal()] = 5;
                iArr[EmomoQuestGameEffectType.DECREASE_OBJECT_DAMAGE.ordinal()] = 6;
                iArr[EmomoQuestGameEffectType.DECREASE_ENEMY_DAMAGE.ordinal()] = 7;
                iArr[EmomoQuestGameEffectType.DECREASE_FALL_DAMAGE.ordinal()] = 8;
                iArr[EmomoQuestGameEffectType.EXTRA_HEAL_ITEM.ordinal()] = 9;
                f55508a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t0 a(EmomoQuestItemAttribute emomoQuestItemAttribute) {
            int i10;
            jo.p.h(emomoQuestItemAttribute, "response");
            switch (C0868a.f55508a[emomoQuestItemAttribute.getEffectType().ordinal()]) {
                case 1:
                    i10 = nd.y0.ic_emomo_quest_effect_hp;
                    break;
                case 2:
                    i10 = nd.y0.S1;
                    break;
                case 3:
                    i10 = nd.y0.ic_emomo_quest_effect_speed;
                    break;
                case 4:
                    i10 = nd.y0.ic_emomo_quest_effect_jump;
                    break;
                case 5:
                    i10 = nd.y0.ic_emomo_quest_effect_jump;
                    break;
                case 6:
                    i10 = nd.y0.ic_emomo_quest_effect_decrease_damage;
                    break;
                case 7:
                    i10 = nd.y0.ic_emomo_quest_effect_decrease_damage;
                    break;
                case 8:
                    i10 = nd.y0.ic_emomo_quest_effect_decrease_damage;
                    break;
                case 9:
                    i10 = nd.y0.ic_emomo_quest_effect_extra_heal_item;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new t0(i10, emomoQuestItemAttribute.getTitle(), emomoQuestItemAttribute.getValue(), emomoQuestItemAttribute.isSpecial(), emomoQuestItemAttribute.getSpecialValue(), null, true, 32, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<t0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final t0 createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new t0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), r0.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final t0[] newArray(int i10) {
            return new t0[i10];
        }
    }

    public t0(int i10, String str, String str2, boolean z10, String str3, r0.a aVar, boolean z11) {
        jo.p.h(str, "labelText");
        jo.p.h(str2, "valueText");
        jo.p.h(str3, "specialValueText");
        jo.p.h(aVar, "type");
        this.f55504w = i10;
        this.f55505x = str;
        this.f55506y = str2;
        this.f55507z = z10;
        this.A = str3;
        this.B = aVar;
        this.C = z11;
    }

    @Override // ud.r0
    public boolean F0() {
        return this.C;
    }

    public final int a() {
        return this.f55504w;
    }

    public final String b() {
        return this.f55505x;
    }

    public final String c() {
        return this.A;
    }

    public final String d() {
        return this.f55506y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f55507z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            return this.f55504w == t0Var.f55504w && jo.p.c(this.f55505x, t0Var.f55505x) && jo.p.c(this.f55506y, t0Var.f55506y) && this.f55507z == t0Var.f55507z && jo.p.c(this.A, t0Var.A) && getType() == t0Var.getType() && F0() == t0Var.F0();
        }
        return false;
    }

    @Override // ud.r0
    public r0.a getType() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f55504w) * 31) + this.f55505x.hashCode()) * 31) + this.f55506y.hashCode()) * 31;
        boolean z10 = this.f55507z;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.A.hashCode()) * 31) + getType().hashCode()) * 31;
        boolean F0 = F0();
        return hashCode2 + (F0 ? 1 : F0);
    }

    public String toString() {
        return "GiftItemAttributeEmomoQuestBindModel(iconDrawableResInt=" + this.f55504w + ", labelText=" + this.f55505x + ", valueText=" + this.f55506y + ", isVisibleSpecialEffect=" + this.f55507z + ", specialValueText=" + this.A + ", type=" + getType() + ", isFillWidth=" + F0() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "out");
        parcel.writeInt(this.f55504w);
        parcel.writeString(this.f55505x);
        parcel.writeString(this.f55506y);
        parcel.writeInt(this.f55507z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeString(this.B.name());
        parcel.writeInt(this.C ? 1 : 0);
    }

    public /* synthetic */ t0(int i10, String str, String str2, boolean z10, String str3, r0.a aVar, boolean z11, int i11, jo.h hVar) {
        this(i10, str, str2, z10, str3, (i11 & 32) != 0 ? r0.a.EMOMO_QUEST : aVar, z11);
    }
}
