package ud;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarBody;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableSetupClothes;
import com.dena.mirrativ.mirrativapi.closet.GameEffect;
import com.dena.mirrativ.mirrativapi.closet.GameItemType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.List;
import ud.p;

/* loaded from: classes2.dex */
public final class q implements p, Parcelable {
    public final String A;
    public long B;
    public boolean C;
    public jf.k0 D;
    public final String E;
    public final String F;
    public final String G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public String L;
    public List<String> M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int Q;
    public final boolean R;
    public final String S;
    public final GameEffect T;
    public final boolean U;
    public final Integer V;
    public final p.a W;

    /* renamed from: w  reason: collision with root package name */
    public final String f55367w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55368x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f55369y;

    /* renamed from: z  reason: collision with root package name */
    public final int f55370z;
    public static final a X = new a(null);
    public static final Parcelable.Creator<q> CREATOR = new b();
    public static final int Y = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(ClosetBuyable closetBuyable, hf.v0 v0Var) {
            GameItemType gameItemType;
            GameItemType gameItemType2;
            GameItemType gameItemType3;
            GameItemType gameItemType4;
            GameItemType gameItemType5;
            jo.p.h(closetBuyable, "closetBuyable");
            jo.p.h(v0Var, "userHelper");
            String str = "";
            boolean z10 = true;
            if (closetBuyable instanceof ClosetAvatarBody) {
                String id2 = closetBuyable.getId();
                String partTitle = closetBuyable.getPartTitle();
                String str2 = partTitle == null ? "" : partTitle;
                Integer isBuyable = closetBuyable.isBuyable();
                boolean z11 = isBuyable != null && isBuyable.intValue() == 1;
                Integer requiredCoin = closetBuyable.getRequiredCoin();
                int intValue = requiredCoin != null ? requiredCoin.intValue() : 0;
                String iconUrl = ((ClosetAvatarBody) closetBuyable).getIconUrl();
                String str3 = iconUrl == null ? "" : iconUrl;
                Long updatedAt = closetBuyable.getUpdatedAt();
                return new q(id2, str2, z11, intValue, str3, updatedAt != null ? updatedAt.longValue() : 0L, b(closetBuyable, v0Var), null, null, null, null, false, null, null, null, null, null, false, false, false, 0, false, null, null, false, null, null, 134217600, null);
            } else if (closetBuyable instanceof ClosetAvatarSimpleValue) {
                ClosetAvatarSimpleValue closetAvatarSimpleValue = (ClosetAvatarSimpleValue) closetBuyable;
                String id3 = closetAvatarSimpleValue.getId();
                String partTitle2 = closetAvatarSimpleValue.getPartTitle();
                String str4 = partTitle2 == null ? "" : partTitle2;
                Integer isBuyable2 = closetBuyable.isBuyable();
                boolean z12 = isBuyable2 != null && isBuyable2.intValue() == 1;
                ClosetAvatarSimpleValue closetAvatarSimpleValue2 = (ClosetAvatarSimpleValue) closetBuyable;
                Integer requiredCoin2 = closetAvatarSimpleValue2.getRequiredCoin();
                int intValue2 = requiredCoin2 != null ? requiredCoin2.intValue() : 0;
                String iconUrl2 = closetAvatarSimpleValue2.getIconUrl();
                String str5 = iconUrl2 == null ? "" : iconUrl2;
                Long updatedAt2 = closetBuyable.getUpdatedAt();
                long longValue = updatedAt2 != null ? updatedAt2.longValue() : 0L;
                boolean isLimitedTime = closetBuyable.isLimitedTime();
                String bannerImageUrl = closetBuyable.getBannerImageUrl();
                String bannerLink = closetBuyable.getBannerLink();
                boolean b10 = b(closetBuyable, v0Var);
                String value = closetAvatarSimpleValue2.getValue();
                GameEffect gameEffect = closetBuyable.getGameEffect();
                if (gameEffect == null || (gameItemType5 = gameEffect.getGameItemType()) == null || !gameItemType5.isEmomoRun()) {
                    z10 = false;
                }
                if (z10) {
                    GameEffect gameEffect2 = closetBuyable.getGameEffect();
                    jo.p.e(gameEffect2);
                    str = gameEffect2.getDescription();
                }
                return new q(id3, str4, z12, intValue2, str5, longValue, b10, null, null, null, null, isLimitedTime, bannerImageUrl, bannerLink, value, null, null, false, false, false, 0, false, str, closetBuyable.getGameEffect(), closetBuyable.isTrial(), null, null, 104826752, null);
            } else if (closetBuyable instanceof ClosetBuyableAccessoryAsset) {
                String id4 = closetBuyable.getId();
                String partTitle3 = closetBuyable.getPartTitle();
                String str6 = partTitle3 == null ? "" : partTitle3;
                Integer isBuyable3 = closetBuyable.isBuyable();
                boolean z13 = isBuyable3 != null && isBuyable3.intValue() == 1;
                Integer requiredCoin3 = closetBuyable.getRequiredCoin();
                int intValue3 = requiredCoin3 != null ? requiredCoin3.intValue() : 0;
                String iconUrl3 = closetBuyable.getIconUrl();
                String str7 = iconUrl3 == null ? "" : iconUrl3;
                Long updatedAt3 = closetBuyable.getUpdatedAt();
                long longValue2 = updatedAt3 != null ? updatedAt3.longValue() : 0L;
                boolean b11 = b(closetBuyable, v0Var);
                ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset = (ClosetBuyableAccessoryAsset) closetBuyable;
                String assetBundleName = closetBuyableAccessoryAsset.getAssetBundleName();
                String assetBundlePrefabName = closetBuyableAccessoryAsset.getAssetBundlePrefabName();
                String position = closetBuyableAccessoryAsset.getPosition();
                boolean isLimitedTime2 = closetBuyable.isLimitedTime();
                String bannerImageUrl2 = closetBuyable.getBannerImageUrl();
                String bannerLink2 = closetBuyable.getBannerLink();
                Integer requiredKandume = closetBuyableAccessoryAsset.getRequiredKandume();
                int intValue4 = requiredKandume != null ? requiredKandume.intValue() : 0;
                boolean z14 = closetBuyableAccessoryAsset.getRequiredKandume() != null;
                GameEffect gameEffect3 = closetBuyable.getGameEffect();
                if (gameEffect3 == null || (gameItemType4 = gameEffect3.getGameItemType()) == null || !gameItemType4.isEmomoRun()) {
                    z10 = false;
                }
                if (z10) {
                    GameEffect gameEffect4 = closetBuyable.getGameEffect();
                    jo.p.e(gameEffect4);
                    str = gameEffect4.getDescription();
                }
                return new q(id4, str6, z13, intValue3, str7, longValue2, b11, null, assetBundleName, assetBundlePrefabName, null, isLimitedTime2, bannerImageUrl2, bannerLink2, null, position, null, false, false, false, intValue4, z14, str, closetBuyable.getGameEffect(), closetBuyable.isTrial(), closetBuyableAccessoryAsset.getRarity(), null, 68109440, null);
            } else if (closetBuyable instanceof ClosetBuyableAsset) {
                String id5 = closetBuyable.getId();
                String partTitle4 = closetBuyable.getPartTitle();
                String str8 = partTitle4 == null ? "" : partTitle4;
                Integer isBuyable4 = closetBuyable.isBuyable();
                boolean z15 = isBuyable4 != null && isBuyable4.intValue() == 1;
                Integer requiredCoin4 = closetBuyable.getRequiredCoin();
                int intValue5 = requiredCoin4 != null ? requiredCoin4.intValue() : 0;
                String iconUrl4 = closetBuyable.getIconUrl();
                String str9 = iconUrl4 == null ? "" : iconUrl4;
                Long updatedAt4 = closetBuyable.getUpdatedAt();
                long longValue3 = updatedAt4 != null ? updatedAt4.longValue() : 0L;
                boolean b12 = b(closetBuyable, v0Var);
                ClosetBuyableAsset closetBuyableAsset = (ClosetBuyableAsset) closetBuyable;
                String assetBundleName2 = closetBuyableAsset.getAssetBundleName();
                String assetBundlePrefabName2 = closetBuyableAsset.getAssetBundlePrefabName();
                boolean isLimitedTime3 = closetBuyable.isLimitedTime();
                String bannerImageUrl3 = closetBuyable.getBannerImageUrl();
                String bannerLink3 = closetBuyable.getBannerLink();
                GameEffect gameEffect5 = closetBuyable.getGameEffect();
                if (gameEffect5 == null || (gameItemType3 = gameEffect5.getGameItemType()) == null || !gameItemType3.isEmomoRun()) {
                    z10 = false;
                }
                if (z10) {
                    GameEffect gameEffect6 = closetBuyable.getGameEffect();
                    jo.p.e(gameEffect6);
                    str = gameEffect6.getDescription();
                }
                return new q(id5, str8, z15, intValue5, str9, longValue3, b12, null, assetBundleName2, assetBundlePrefabName2, null, isLimitedTime3, bannerImageUrl3, bannerLink3, null, null, null, false, false, false, 0, false, str, closetBuyable.getGameEffect(), closetBuyable.isTrial(), null, null, 104842368, null);
            } else if (closetBuyable instanceof ClosetBuyableBackground) {
                String id6 = closetBuyable.getId();
                String partTitle5 = closetBuyable.getPartTitle();
                String str10 = partTitle5 == null ? "" : partTitle5;
                Integer isBuyable5 = closetBuyable.isBuyable();
                boolean z16 = isBuyable5 != null && isBuyable5.intValue() == 1;
                Integer requiredCoin5 = closetBuyable.getRequiredCoin();
                int intValue6 = requiredCoin5 != null ? requiredCoin5.intValue() : 0;
                String iconUrl5 = closetBuyable.getIconUrl();
                String str11 = iconUrl5 == null ? "" : iconUrl5;
                Long updatedAt5 = closetBuyable.getUpdatedAt();
                long longValue4 = updatedAt5 != null ? updatedAt5.longValue() : 0L;
                boolean b13 = b(closetBuyable, v0Var);
                ClosetBuyableBackground closetBuyableBackground = (ClosetBuyableBackground) closetBuyable;
                String assetBundleName3 = closetBuyableBackground.getAssetBundleName();
                String str12 = assetBundleName3 == null ? "" : assetBundleName3;
                String assetBundlePrefabName3 = closetBuyableBackground.getAssetBundlePrefabName();
                String str13 = assetBundlePrefabName3 == null ? "" : assetBundlePrefabName3;
                String position2 = closetBuyableBackground.getPosition();
                String str14 = position2 == null ? "" : position2;
                boolean isLimitedTime4 = closetBuyable.isLimitedTime();
                String bannerImageUrl4 = closetBuyable.getBannerImageUrl();
                String bannerLink4 = closetBuyable.getBannerLink();
                String url = closetBuyableBackground.getUrl();
                GameEffect gameEffect7 = closetBuyable.getGameEffect();
                if (gameEffect7 == null || (gameItemType2 = gameEffect7.getGameItemType()) == null || !gameItemType2.isEmomoRun()) {
                    z10 = false;
                }
                if (z10) {
                    GameEffect gameEffect8 = closetBuyable.getGameEffect();
                    jo.p.e(gameEffect8);
                    str = gameEffect8.getDescription();
                }
                return new q(id6, str10, z16, intValue6, str11, longValue4, b13, null, str12, str13, url, isLimitedTime4, bannerImageUrl4, bannerLink4, null, str14, null, false, false, false, 0, false, str, closetBuyable.getGameEffect(), closetBuyable.isTrial(), null, null, 104808576, null);
            } else if (closetBuyable instanceof ClosetBuyableSetupClothes) {
                String id7 = closetBuyable.getId();
                String partTitle6 = closetBuyable.getPartTitle();
                String str15 = partTitle6 == null ? "" : partTitle6;
                Integer isBuyable6 = closetBuyable.isBuyable();
                boolean z17 = isBuyable6 != null && isBuyable6.intValue() == 1;
                Integer requiredCoin6 = closetBuyable.getRequiredCoin();
                int intValue7 = requiredCoin6 != null ? requiredCoin6.intValue() : 0;
                String iconUrl6 = closetBuyable.getIconUrl();
                String str16 = iconUrl6 == null ? "" : iconUrl6;
                Long updatedAt6 = closetBuyable.getUpdatedAt();
                long longValue5 = updatedAt6 != null ? updatedAt6.longValue() : 0L;
                boolean b14 = b(closetBuyable, v0Var);
                ClosetBuyableSetupClothes closetBuyableSetupClothes = (ClosetBuyableSetupClothes) closetBuyable;
                String assetBundleName4 = closetBuyableSetupClothes.getAssetBundleName();
                String assetBundlePrefabName4 = closetBuyableSetupClothes.getAssetBundlePrefabName();
                List<String> excludeParts = closetBuyableSetupClothes.getExcludeParts();
                boolean isLimitedTime5 = closetBuyable.isLimitedTime();
                String bannerImageUrl5 = closetBuyable.getBannerImageUrl();
                String bannerLink5 = closetBuyable.getBannerLink();
                GameEffect gameEffect9 = closetBuyable.getGameEffect();
                if (gameEffect9 == null || (gameItemType = gameEffect9.getGameItemType()) == null || !gameItemType.isEmomoRun()) {
                    z10 = false;
                }
                if (z10) {
                    GameEffect gameEffect10 = closetBuyable.getGameEffect();
                    jo.p.e(gameEffect10);
                    str = gameEffect10.getDescription();
                }
                return new q(id7, str15, z17, intValue7, str16, longValue5, b14, null, assetBundleName4, assetBundlePrefabName4, null, isLimitedTime5, bannerImageUrl5, bannerLink5, null, null, excludeParts, false, false, false, 0, false, str, closetBuyable.getGameEffect(), closetBuyable.isTrial(), null, null, 104776832, null);
            } else {
                throw new IllegalArgumentException("unknown closetBuyable type " + closetBuyable);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(com.dena.mirrativ.mirrativapi.closet.ClosetBuyable r8, hf.v0 r9) {
            /*
                r7 = this;
                java.lang.Integer r0 = r8.isBuyable()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L9
                goto L38
            L9:
                int r0 = r0.intValue()
                if (r0 != 0) goto L38
                java.lang.Long r0 = r8.getUpdatedAt()
                if (r0 == 0) goto L34
                long r3 = r0.longValue()
                r5 = 1575126000(0x5de283f0, double:7.782156445E-315)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 < 0) goto L34
                java.lang.String r0 = r8.getIconUrl()
                if (r0 != 0) goto L28
                java.lang.String r0 = ""
            L28:
                boolean r8 = r8.isTrial()
                boolean r8 = r9.o(r0, r8)
                if (r8 != 0) goto L34
                r8 = r1
                goto L35
            L34:
                r8 = r2
            L35:
                if (r8 == 0) goto L38
                goto L39
            L38:
                r1 = r2
            L39:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.q.a.b(com.dena.mirrativ.mirrativapi.closet.ClosetBuyable, hf.v0):boolean");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final q createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "parcel");
            return new q(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, jf.k0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (GameEffect) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), p.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f55371a;

        static {
            int[] iArr = new int[jf.k0.values().length];
            iArr[jf.k0.PERSONA.ordinal()] = 1;
            iArr[jf.k0.MOTION_UP.ordinal()] = 2;
            iArr[jf.k0.MOTION_LEFT.ordinal()] = 3;
            iArr[jf.k0.MOTION_RIGHT.ordinal()] = 4;
            iArr[jf.k0.MOTION_DOWN.ordinal()] = 5;
            f55371a = iArr;
        }
    }

    public q(String str, String str2, boolean z10, int i10, String str3, long j10, boolean z11, jf.k0 k0Var, String str4, String str5, String str6, boolean z12, String str7, String str8, String str9, String str10, List<String> list, boolean z13, boolean z14, boolean z15, int i11, boolean z16, String str11, GameEffect gameEffect, boolean z17, Integer num, p.a aVar) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "partTitle");
        jo.p.h(str3, "iconUrl");
        jo.p.h(k0Var, "partsCategory");
        jo.p.h(str4, "assetBundleName");
        jo.p.h(str5, "assetBundlePrefabName");
        jo.p.h(str6, "url");
        jo.p.h(str9, "value");
        jo.p.h(list, "excludeParts");
        jo.p.h(str11, "emomoRunGameEffectText");
        jo.p.h(aVar, "type");
        this.f55367w = str;
        this.f55368x = str2;
        this.f55369y = z10;
        this.f55370z = i10;
        this.A = str3;
        this.B = j10;
        this.C = z11;
        this.D = k0Var;
        this.E = str4;
        this.F = str5;
        this.G = str6;
        this.H = z12;
        this.I = str7;
        this.J = str8;
        this.K = str9;
        this.L = str10;
        this.M = list;
        this.N = z13;
        this.O = z14;
        this.P = z15;
        this.Q = i11;
        this.R = z16;
        this.S = str11;
        this.T = gameEffect;
        this.U = z17;
        this.V = num;
        this.W = aVar;
    }

    public final boolean A() {
        int i10 = c.f55371a[this.D.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
    }

    public final boolean B() {
        return this.R;
    }

    public final boolean C() {
        return this.U || this.f55369y;
    }

    public final boolean D() {
        return this.f55369y && this.B > 0 && (System.currentTimeMillis() / 1000) - this.B <= 604800;
    }

    public final boolean E() {
        return this.U;
    }

    public final void F(boolean z10) {
        this.P = z10;
    }

    public final void G(boolean z10) {
        this.C = z10;
    }

    public final void H(jf.k0 k0Var) {
        jo.p.h(k0Var, "<set-?>");
        this.D = k0Var;
    }

    public final void I(boolean z10) {
        this.N = z10;
    }

    public final int a() {
        boolean z10 = this.O;
        if ((z10 && this.f55369y) || z10 || !this.f55369y) {
            return 0;
        }
        return this.f55370z;
    }

    public final int b() {
        boolean z10 = this.O;
        if ((z10 && this.f55369y) || z10 || !this.f55369y) {
            return 0;
        }
        return this.Q;
    }

    public final String c() {
        int a10;
        jo.i0 i0Var = jo.i0.f38149a;
        Object[] objArr = new Object[1];
        if (this.R) {
            a10 = b();
        } else {
            a10 = a();
        }
        objArr[0] = Integer.valueOf(a10);
        String format = String.format("%,d", Arrays.copyOf(objArr, 1));
        jo.p.g(format, "format(format, *args)");
        return format;
    }

    public final String d() {
        return this.I;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return jo.p.c(this.f55367w, qVar.f55367w) && jo.p.c(this.f55368x, qVar.f55368x) && this.f55369y == qVar.f55369y && this.f55370z == qVar.f55370z && jo.p.c(this.A, qVar.A) && this.B == qVar.B && this.C == qVar.C && this.D == qVar.D && jo.p.c(this.E, qVar.E) && jo.p.c(this.F, qVar.F) && jo.p.c(this.G, qVar.G) && this.H == qVar.H && jo.p.c(this.I, qVar.I) && jo.p.c(this.J, qVar.J) && jo.p.c(this.K, qVar.K) && jo.p.c(this.L, qVar.L) && jo.p.c(this.M, qVar.M) && this.N == qVar.N && this.O == qVar.O && this.P == qVar.P && this.Q == qVar.Q && this.R == qVar.R && jo.p.c(this.S, qVar.S) && jo.p.c(this.T, qVar.T) && this.U == qVar.U && jo.p.c(this.V, qVar.V) && getType() == qVar.getType();
        }
        return false;
    }

    public final boolean f() {
        return this.C;
    }

    public final String g() {
        return this.S;
    }

    @Override // ud.p
    public p.a getType() {
        return this.W;
    }

    public final GameEffect h() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f55367w.hashCode() * 31) + this.f55368x.hashCode()) * 31;
        boolean z10 = this.f55369y;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + Integer.hashCode(this.f55370z)) * 31) + this.A.hashCode()) * 31) + Long.hashCode(this.B)) * 31;
        boolean z11 = this.C;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i11) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31;
        boolean z12 = this.H;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode3 + i12) * 31;
        String str = this.I;
        int hashCode4 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.J;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.K.hashCode()) * 31;
        String str3 = this.L;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.M.hashCode()) * 31;
        boolean z13 = this.N;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode6 + i14) * 31;
        boolean z14 = this.O;
        int i16 = z14;
        if (z14 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z15 = this.P;
        int i18 = z15;
        if (z15 != 0) {
            i18 = 1;
        }
        int hashCode7 = (((i17 + i18) * 31) + Integer.hashCode(this.Q)) * 31;
        boolean z16 = this.R;
        int i19 = z16;
        if (z16 != 0) {
            i19 = 1;
        }
        int hashCode8 = (((hashCode7 + i19) * 31) + this.S.hashCode()) * 31;
        GameEffect gameEffect = this.T;
        int hashCode9 = (hashCode8 + (gameEffect == null ? 0 : gameEffect.hashCode())) * 31;
        boolean z17 = this.U;
        int i20 = (hashCode9 + (z17 ? 1 : z17 ? 1 : 0)) * 31;
        Integer num = this.V;
        return ((i20 + (num != null ? num.hashCode() : 0)) * 31) + getType().hashCode();
    }

    public final String i() {
        return this.A;
    }

    public final String j() {
        return this.f55367w;
    }

    public final String k() {
        return this.f55368x;
    }

    public final jf.k0 l() {
        return this.D;
    }

    public final Integer m() {
        return this.V;
    }

    public final int n() {
        return this.f55370z;
    }

    public final int o() {
        if (this.R) {
            return nd.y0.bg_shop_kandume;
        }
        return 0;
    }

    public final int p() {
        if (this.R) {
            return nd.y0.f42248c2;
        }
        return 0;
    }

    public final boolean q() {
        return this.N;
    }

    public final int r() {
        boolean z10 = this.N;
        if (z10 && this.R && this.f55369y) {
            return nd.y0.ic_kandume_selected_check;
        }
        if (z10 && this.U) {
            return nd.y0.ic_button_check;
        }
        if (z10) {
            return nd.y0.ic_selected_check;
        }
        return 0;
    }

    public final int s() {
        boolean z10 = this.N;
        if (z10 && this.R && this.f55369y) {
            return nd.y0.bg_avatar_kandume_selected_oval;
        }
        if (z10 && this.U) {
            return nd.y0.bg_avatar_trial_item_selected_oval;
        }
        if (z10) {
            return nd.y0.bg_avatar_selected_oval;
        }
        return nd.y0.bg_avatar_not_selected_oval;
    }

    public final int t() {
        if (this.N) {
            if (this.f55369y) {
                if (this.R) {
                    return nd.w0.kandume;
                }
                return nd.w0.P0;
            }
            return nd.w0.M0;
        }
        return nd.w0.f42243x0;
    }

    public String toString() {
        return "ClosetPartsBindModel(id=" + this.f55367w + ", partTitle=" + this.f55368x + ", isBuyable=" + this.f55369y + ", requiredCoin=" + this.f55370z + ", iconUrl=" + this.A + ", updatedAt=" + this.B + ", displayBadge=" + this.C + ", partsCategory=" + this.D + ", assetBundleName=" + this.E + ", assetBundlePrefabName=" + this.F + ", url=" + this.G + ", isLimitedTime=" + this.H + ", bannerImageUrl=" + this.I + ", bannerLink=" + this.J + ", value=" + this.K + ", position=" + this.L + ", excludeParts=" + this.M + ", selected=" + this.N + ", isFree=" + this.O + ", isDisabledItem=" + this.P + ", requiredKandume=" + this.Q + ", isRequiredKandume=" + this.R + ", emomoRunGameEffectText=" + this.S + ", gameEffect=" + this.T + ", isTrial=" + this.U + ", rarity=" + this.V + ", type=" + getType() + ')';
    }

    public final long u() {
        return this.B;
    }

    public final String v() {
        return this.G;
    }

    public final String w() {
        return this.K;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int intValue;
        jo.p.h(parcel, "out");
        parcel.writeString(this.f55367w);
        parcel.writeString(this.f55368x);
        parcel.writeInt(this.f55369y ? 1 : 0);
        parcel.writeInt(this.f55370z);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeString(this.D.name());
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeStringList(this.M);
        parcel.writeInt(this.N ? 1 : 0);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeString(this.S);
        parcel.writeSerializable(this.T);
        parcel.writeInt(this.U ? 1 : 0);
        Integer num = this.V;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.W.name());
    }

    public final boolean x() {
        return this.f55369y;
    }

    public final boolean y() {
        return this.P;
    }

    public final boolean z() {
        return this.H;
    }

    public /* synthetic */ q(String str, String str2, boolean z10, int i10, String str3, long j10, boolean z11, jf.k0 k0Var, String str4, String str5, String str6, boolean z12, String str7, String str8, String str9, String str10, List list, boolean z13, boolean z14, boolean z15, int i11, boolean z16, String str11, GameEffect gameEffect, boolean z17, Integer num, p.a aVar, int i12, jo.h hVar) {
        this(str, str2, z10, i10, str3, j10, z11, (i12 & 128) != 0 ? jf.k0.GENDER : k0Var, (i12 & 256) != 0 ? "" : str4, (i12 & 512) != 0 ? "" : str5, (i12 & 1024) != 0 ? "" : str6, (i12 & 2048) != 0 ? false : z12, (i12 & 4096) != 0 ? "" : str7, (i12 & 8192) != 0 ? "" : str8, (i12 & 16384) != 0 ? "" : str9, (32768 & i12) != 0 ? "" : str10, (65536 & i12) != 0 ? xn.s.k() : list, (131072 & i12) != 0 ? false : z13, (262144 & i12) != 0 ? false : z14, (524288 & i12) != 0 ? false : z15, (1048576 & i12) != 0 ? 0 : i11, (2097152 & i12) != 0 ? false : z16, (4194304 & i12) != 0 ? "" : str11, (8388608 & i12) != 0 ? null : gameEffect, (16777216 & i12) != 0 ? false : z17, (33554432 & i12) != 0 ? null : num, (i12 & 67108864) != 0 ? p.a.PARTS : aVar);
    }
}
