package nf;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarBody;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarCompanion;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetBuyableSetupClothes;
import com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset;
import com.dena.mirrativ.mirrativapi.closet.GameEffect;
import com.dena.mirrativ.mirrativapi.closet.GameItemType;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import com.dena.mirrorman.net.api.response.AvatarPart;
import com.dena.mirrorman.unity.UnityManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.greenrobot.eventbus.ThreadMode;
import pd.f;
import ud.p2;
import ud.r3;

/* loaded from: classes3.dex */
public final class f extends androidx.lifecycle.q0 implements uo.q0 {
    public final kf.v A;
    public final androidx.lifecycle.e0<Boolean> A0;
    public final hf.v0 B;
    public final LiveData<Boolean> B0;
    public final hf.h<ud.p> C;
    public final androidx.lifecycle.e0<Boolean> C0;
    public final /* synthetic */ uo.q0 D;
    public final LiveData<Boolean> D0;
    public final wo.f<wn.v> E;
    public final androidx.lifecycle.e0<Boolean> E0;
    public final androidx.lifecycle.e0<Boolean> F;
    public final LiveData<Boolean> F0;
    public final LiveData<Boolean> G;
    public final androidx.lifecycle.e0<Boolean> G0;
    public final wo.f<wn.v> H;
    public final LiveData<Boolean> H0;
    public final wo.f<Integer> I;
    public final androidx.lifecycle.e0<Integer> I0;
    public final wo.f<wn.v> J;
    public final LiveData<Integer> J0;
    public final wo.f<UpdateClosetNameRequest> K;
    public final androidx.lifecycle.e0<Boolean> K0;
    public final wo.f<Integer> L;
    public final LiveData<Boolean> L0;
    public final wo.f<MRError> M;
    public final androidx.lifecycle.e0<Boolean> M0;
    public final wo.f<UpdateClosetImagesRequest> N;
    public final LiveData<Boolean> N0;
    public final wo.f<UpdateClosetImagesRequest> O;
    public List<jf.l> O0;
    public final androidx.lifecycle.e0<Closet> P;
    public final androidx.lifecycle.e0<jf.p> P0;
    public final androidx.lifecycle.e0<Closet> Q;
    public final androidx.lifecycle.e0<jf.n> Q0;
    public final LiveData<Closet> R;
    public final LiveData<jf.n> R0;
    public final androidx.lifecycle.e0<ClosetAvatar> S;
    public final androidx.lifecycle.e0<List<ud.q>> S0;
    public final LiveData<ClosetAvatar> T;
    public final LiveData<List<ud.q>> T0;
    public ClosetAvatar U;
    public final androidx.lifecycle.e0<List<ud.q>> U0;
    public ClosetAvatar V;
    public final LiveData<List<ud.q>> V0;
    public final androidx.lifecycle.e0<ClosetAvatarPartsResponse> W;
    public xo.r<Boolean> W0;
    public final LiveData<ClosetAvatarPartsResponse> X;
    public final xo.w<Boolean> X0;
    public final androidx.lifecycle.e0<List<Closet>> Y;
    public final xo.r<MRError> Y0;
    public final LiveData<List<Closet>> Z;
    public final xo.w<MRError> Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<jf.c> f42662a0;

    /* renamed from: a1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42663a1;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<jf.c> f42664b0;

    /* renamed from: b1  reason: collision with root package name */
    public final LiveData<Boolean> f42665b1;

    /* renamed from: c0  reason: collision with root package name */
    public jf.m0 f42666c0;

    /* renamed from: c1  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<jf.k0>> f42667c1;

    /* renamed from: d0  reason: collision with root package name */
    public jf.k0 f42668d0;

    /* renamed from: d1  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<r3>> f42669d1;

    /* renamed from: e0  reason: collision with root package name */
    public String f42670e0;

    /* renamed from: e1  reason: collision with root package name */
    public final LiveData<List<r3>> f42671e1;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f42672f0;

    /* renamed from: f1  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<ud.p>> f42673f1;

    /* renamed from: g0  reason: collision with root package name */
    public final LiveData<Integer> f42674g0;

    /* renamed from: g1  reason: collision with root package name */
    public final LiveData<List<ud.p>> f42675g1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f42676h0;

    /* renamed from: h1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42677h1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f42678i0;

    /* renamed from: i1  reason: collision with root package name */
    public final LiveData<Boolean> f42679i1;

    /* renamed from: j0  reason: collision with root package name */
    public int f42680j0;

    /* renamed from: j1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42681j1;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<jf.n0>> f42682k0;

    /* renamed from: k1  reason: collision with root package name */
    public final LiveData<Boolean> f42683k1;

    /* renamed from: l0  reason: collision with root package name */
    public final LiveData<List<jf.n0>> f42684l0;

    /* renamed from: l1  reason: collision with root package name */
    public final xo.s<List<jf.d>> f42685l1;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<jf.l0>> f42686m0;

    /* renamed from: m1  reason: collision with root package name */
    public final xo.g0<List<jf.d>> f42687m1;

    /* renamed from: n0  reason: collision with root package name */
    public final LiveData<List<jf.l0>> f42688n0;

    /* renamed from: n1  reason: collision with root package name */
    public final nd.s0<Boolean> f42689n1;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<ud.p>> f42690o0;

    /* renamed from: o1  reason: collision with root package name */
    public final wo.f<p2> f42691o1;

    /* renamed from: p0  reason: collision with root package name */
    public final LiveData<List<ud.p>> f42692p0;

    /* renamed from: p1  reason: collision with root package name */
    public final wo.f<wn.v> f42693p1;

    /* renamed from: q0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<ud.p>> f42694q0;

    /* renamed from: q1  reason: collision with root package name */
    public String f42695q1;

    /* renamed from: r0  reason: collision with root package name */
    public final LiveData<List<ud.p>> f42696r0;

    /* renamed from: r1  reason: collision with root package name */
    public final wo.f<wn.v> f42697r1;

    /* renamed from: s0  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<ud.o>> f42698s0;

    /* renamed from: s1  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<jf.k0>> f42699s1;

    /* renamed from: t0  reason: collision with root package name */
    public final LiveData<List<ud.o>> f42700t0;

    /* renamed from: t1  reason: collision with root package name */
    public final LiveData<List<jf.k0>> f42701t1;

    /* renamed from: u0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42702u0;

    /* renamed from: v0  reason: collision with root package name */
    public final LiveData<Boolean> f42703v0;

    /* renamed from: w0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42704w0;

    /* renamed from: x0  reason: collision with root package name */
    public final LiveData<Boolean> f42705x0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42706y;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f42707y0;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f42708z;

    /* renamed from: z0  reason: collision with root package name */
    public final LiveData<Boolean> f42709z0;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42710a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f42711b;

        static {
            int[] iArr = new int[jf.k0.values().length];
            iArr[jf.k0.FACE_PAINT.ordinal()] = 1;
            iArr[jf.k0.BEARD.ordinal()] = 2;
            iArr[jf.k0.CHEEK.ordinal()] = 3;
            iArr[jf.k0.EYESHADOW.ordinal()] = 4;
            iArr[jf.k0.LIP.ordinal()] = 5;
            iArr[jf.k0.PET.ordinal()] = 6;
            iArr[jf.k0.HAT.ordinal()] = 7;
            iArr[jf.k0.GLASSES.ordinal()] = 8;
            iArr[jf.k0.SCARF.ordinal()] = 9;
            iArr[jf.k0.WEAPON.ordinal()] = 10;
            iArr[jf.k0.WING.ordinal()] = 11;
            iArr[jf.k0.COMPANION.ordinal()] = 12;
            iArr[jf.k0.COMPANION_TOPS.ordinal()] = 13;
            iArr[jf.k0.COMPANION_HAT.ordinal()] = 14;
            iArr[jf.k0.COMPANION_SCARF.ordinal()] = 15;
            iArr[jf.k0.BACK_WING.ordinal()] = 16;
            iArr[jf.k0.EFFECT.ordinal()] = 17;
            iArr[jf.k0.LEFT_INTERIOR.ordinal()] = 18;
            iArr[jf.k0.CENTER_INTERIOR.ordinal()] = 19;
            iArr[jf.k0.RIGHT_INTERIOR.ordinal()] = 20;
            iArr[jf.k0.HAT_V2.ordinal()] = 21;
            iArr[jf.k0.HAIR_ORNAMENT.ordinal()] = 22;
            iArr[jf.k0.HEAD_BAND.ordinal()] = 23;
            iArr[jf.k0.GLASSES_V2.ordinal()] = 24;
            iArr[jf.k0.MASK.ordinal()] = 25;
            iArr[jf.k0.EARRING.ordinal()] = 26;
            iArr[jf.k0.LEFT_WEAPON.ordinal()] = 27;
            iArr[jf.k0.RIGHT_WEAPON.ordinal()] = 28;
            iArr[jf.k0.BOTH_WEAPON.ordinal()] = 29;
            iArr[jf.k0.KEMOMIMI.ordinal()] = 30;
            iArr[jf.k0.NECKLACE.ordinal()] = 31;
            iArr[jf.k0.GENDER.ordinal()] = 32;
            iArr[jf.k0.PERSONA.ordinal()] = 33;
            iArr[jf.k0.MOTION_UP.ordinal()] = 34;
            iArr[jf.k0.MOTION_LEFT.ordinal()] = 35;
            iArr[jf.k0.MOTION_RIGHT.ordinal()] = 36;
            iArr[jf.k0.MOTION_DOWN.ordinal()] = 37;
            iArr[jf.k0.PROPOTION.ordinal()] = 38;
            iArr[jf.k0.HEAD.ordinal()] = 39;
            iArr[jf.k0.HAIR.ordinal()] = 40;
            iArr[jf.k0.EYEBROW.ordinal()] = 41;
            iArr[jf.k0.EYE.ordinal()] = 42;
            iArr[jf.k0.NOSE.ordinal()] = 43;
            iArr[jf.k0.MOUTH.ordinal()] = 44;
            iArr[jf.k0.SETUP_CLOTHES.ordinal()] = 45;
            iArr[jf.k0.ONEPIECE.ordinal()] = 46;
            iArr[jf.k0.TOPS.ordinal()] = 47;
            iArr[jf.k0.BOTTOMS.ordinal()] = 48;
            iArr[jf.k0.SOCKS.ordinal()] = 49;
            iArr[jf.k0.SHOES.ordinal()] = 50;
            iArr[jf.k0.BACKGROUND.ordinal()] = 51;
            iArr[jf.k0.MACHINE.ordinal()] = 52;
            f42710a = iArr;
            int[] iArr2 = new int[jf.m0.values().length];
            iArr2[jf.m0.GENDER.ordinal()] = 1;
            iArr2[jf.m0.MOTION.ordinal()] = 2;
            iArr2[jf.m0.FACE.ordinal()] = 3;
            iArr2[jf.m0.COSTUME.ordinal()] = 4;
            iArr2[jf.m0.ACCESSORY.ordinal()] = 5;
            iArr2[jf.m0.COMPANION.ordinal()] = 6;
            iArr2[jf.m0.ROOM.ordinal()] = 7;
            iArr2[jf.m0.MACHINE.ordinal()] = 8;
            f42711b = iArr2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a0 f42712w = new a0();

        public a0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$2", f = "ClosetStore.kt", l = {408}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42713w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.d f42715y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(f.d dVar, ao.d<? super a1> dVar2) {
            super(2, dVar2);
            this.f42715y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a1(this.f42715y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42713w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.I;
                Integer d10 = co.b.d(this.f42715y.a());
                this.f42713w = 1;
                if (fVar.r(d10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f42716w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final b0 f42717w = new b0();

        public b0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$35", f = "ClosetStore.kt", l = {689}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42718w;

        public b1(ao.d<? super b1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42718w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = f.this.W0;
                Boolean a10 = co.b.a(true);
                this.f42718w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f42720w = new c();

        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c0 f42721w = new c0();

        public c0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$36", f = "ClosetStore.kt", l = {696}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42722w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.m f42724y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(f.m mVar, ao.d<? super c1> dVar) {
            super(2, dVar);
            this.f42724y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c1(this.f42724y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42722w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = f.this.Y0;
                MRError a10 = this.f42724y.a();
                this.f42722w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f42725w = new d();

        public d() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final d0 f42726w = new d0();

        public d0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$37", f = "ClosetStore.kt", l = {704}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42727w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.l f42729y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(f.l lVar, ao.d<? super d1> dVar) {
            super(2, dVar);
            this.f42729y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d1(this.f42729y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42727w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.M;
                MRError a10 = this.f42729y.a();
                this.f42727w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f42730w = new e();

        public e() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final e0 f42731w = new e0();

        public e0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$38", f = "ClosetStore.kt", l = {712}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42732w;

        public e1(ao.d<? super e1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42732w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.f42693p1;
                wn.v vVar = wn.v.f59242a;
                this.f42732w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* renamed from: nf.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0633f extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0633f f42734w = new C0633f();

        public C0633f() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final f0 f42735w = new f0();

        public f0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$49", f = "ClosetStore.kt", l = {903}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42736w;

        public f1(ao.d<? super f1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42736w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.f42697r1;
                wn.v vVar = wn.v.f59242a;
                this.f42736w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f42738w = new g();

        public g() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final g0 f42739w = new g0();

        public g0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$4", f = "ClosetStore.kt", l = {433}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42740w;

        public g1(ao.d<? super g1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42740w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.J;
                wn.v vVar = wn.v.f59242a;
                this.f42740w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f42742w = new h();

        public h() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final h0 f42743w = new h0();

        public h0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$6", f = "ClosetStore.kt", l = {459}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42744w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.j f42746y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(f.j jVar, ao.d<? super h1> dVar) {
            super(2, dVar);
            this.f42746y = jVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h1(this.f42746y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42744w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.K;
                UpdateClosetNameRequest a10 = this.f42746y.a();
                this.f42744w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f42747w = new i();

        public i() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final i0 f42748w = new i0();

        public i0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$8", f = "ClosetStore.kt", l = {499}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42749w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.g f42751y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(f.g gVar, ao.d<? super i1> dVar) {
            super(2, dVar);
            this.f42751y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i1(this.f42751y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42749w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.L;
                Integer d10 = co.b.d(this.f42751y.a());
                this.f42749w = 1;
                if (fVar.r(d10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f42752w = new j();

        public j() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final j0 f42753w = new j0();

        public j0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$refresh$13", f = "ClosetStore.kt", l = {1115, 1118, 1127, 1135}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42754w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ClosetBuyableAccessoryAsset f42756y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f42757z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset, boolean z10, ao.d<? super j1> dVar) {
            super(2, dVar);
            this.f42756y = closetBuyableAccessoryAsset;
            this.f42757z = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j1(this.f42756y, this.f42757z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42754w;
            if (i10 == 0) {
                wn.m.b(obj);
                nd.s0 s0Var = f.this.f42689n1;
                ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset = this.f42756y;
                Boolean a10 = co.b.a((closetBuyableAccessoryAsset != null ? jo.p.c(closetBuyableAccessoryAsset.getAddPartTextEnabled(), co.b.a(true)) : false) || this.f42757z);
                this.f42754w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            if (this.f42757z && f.this.A.l2()) {
                f.this.A.w4(false);
                wo.f fVar = f.this.f42691o1;
                String string = f.this.f42708z.getString(nd.f1.text_tutorial_companion_name_title);
                jo.p.g(string, "resources.getString(R.st…ial_companion_name_title)");
                String string2 = f.this.f42708z.getString(nd.f1.text_tutorial_companion_name_description);
                jo.p.g(string2, "resources.getString(R.st…mpanion_name_description)");
                p2 p2Var = new p2(true, string, string2);
                this.f42754w = 2;
                if (fVar.r(p2Var, this) == c10) {
                    return c10;
                }
            } else {
                ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset2 = this.f42756y;
                if (!(closetBuyableAccessoryAsset2 != null ? jo.p.c(closetBuyableAccessoryAsset2.getAddPartTextEnabled(), co.b.a(true)) : false) || !f.this.A.c4()) {
                    wo.f fVar2 = f.this.f42691o1;
                    p2 p2Var2 = new p2(false, null, null, 6, null);
                    this.f42754w = 4;
                    if (fVar2.r(p2Var2, this) == c10) {
                        return c10;
                    }
                } else {
                    f.this.A.m4(false);
                    wo.f fVar3 = f.this.f42691o1;
                    String string3 = f.this.f42708z.getString(nd.f1.text_part_text_tutorial_title);
                    jo.p.g(string3, "resources.getString(R.st…part_text_tutorial_title)");
                    String string4 = f.this.f42708z.getString(nd.f1.text_part_text_tutorial_message);
                    jo.p.g(string4, "resources.getString(R.st…rt_text_tutorial_message)");
                    p2 p2Var3 = new p2(true, string3, string4);
                    this.f42754w = 3;
                    if (fVar3.r(p2Var3, this) == c10) {
                        return c10;
                    }
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f42758w = new k();

        public k() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class k0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final k0 f42759w = new k0();

        public k0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$refresh$14", f = "ClosetStore.kt", l = {1169}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42760w;

        public k1(ao.d<? super k1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42760w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.E;
                wn.v vVar = wn.v.f59242a;
                this.f42760w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class l extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final l f42762w = new l();

        public l() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class l0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final l0 f42763w = new l0();

        public l0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class l1 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final l1 f42764w = new l1();

        public l1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            GameItemType gameItemType;
            jo.p.h(closetBuyable, "asset");
            GameEffect gameEffect = closetBuyable.getGameEffect();
            return Boolean.valueOf((gameEffect == null || (gameItemType = gameEffect.getGameItemType()) == null) ? false : gameItemType.isShooter());
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f42765w = new m();

        public m() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class m0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final m0 f42766w = new m0();

        public m0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class m1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final m1 f42767w = new m1();

        public m1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Long.valueOf(qVar.u());
        }
    }

    /* loaded from: classes3.dex */
    public static final class n extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final n f42768w = new n();

        public n() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class n0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final n0 f42769w = new n0();

        public n0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class n1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final n1 f42770w = new n1();

        public n1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return qVar.j();
        }
    }

    /* loaded from: classes3.dex */
    public static final class o extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final o f42771w = new o();

        public o() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final o0 f42772w = new o0();

        public o0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final o1 f42773w = new o1();

        public o1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Long.valueOf(qVar.u());
        }
    }

    /* loaded from: classes3.dex */
    public static final class p extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final p f42774w = new p();

        public p() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class p0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final p0 f42775w = new p0();

        public p0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class p1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final p1 f42776w = new p1();

        public p1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Integer.valueOf(Integer.parseInt(qVar.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class q extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final q f42777w = new q();

        public q() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class q0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final q0 f42778w = new q0();

        public q0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class q1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final q1 f42779w = new q1();

        public q1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Boolean.valueOf(!qVar.E());
        }
    }

    /* loaded from: classes3.dex */
    public static final class r extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final r f42780w = new r();

        public r() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class r0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final r0 f42781w = new r0();

        public r0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class r1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final r1 f42782w = new r1();

        public r1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Long.valueOf(qVar.u() * (-1));
        }
    }

    /* loaded from: classes3.dex */
    public static final class s extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final s f42783w = new s();

        public s() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class s0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final s0 f42784w = new s0();

        public s0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class s1 extends jo.q implements io.l<ud.q, Comparable<?>> {

        /* renamed from: w  reason: collision with root package name */
        public static final s1 f42785w = new s1();

        public s1() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Comparable<?> invoke(ud.q qVar) {
            jo.p.h(qVar, "it");
            return Integer.valueOf(Integer.parseInt(qVar.j()) * (-1));
        }
    }

    /* loaded from: classes3.dex */
    public static final class t extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final t f42786w = new t();

        public t() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class t0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final t0 f42787w = new t0();

        public t0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final u f42788w = new u();

        public u() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class u0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final u0 f42789w = new u0();

        public u0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class v extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final v f42790w = new v();

        public v() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class v0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final v0 f42791w = new v0();

        public v0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class w extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final w f42792w = new w();

        public w() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class w0 extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final w0 f42793w = new w0();

        public w0() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class x extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final x f42794w = new x();

        public x() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$10", f = "ClosetStore.kt", l = {525}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class x0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42795w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.i f42797y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(f.i iVar, ao.d<? super x0> dVar) {
            super(2, dVar);
            this.f42797y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x0(this.f42797y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42795w;
            if (i10 == 0) {
                wn.m.b(obj);
                f.this.F.p(co.b.a(false));
                wo.f fVar = f.this.N;
                UpdateClosetImagesRequest a10 = this.f42797y.a();
                this.f42795w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class y extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final y f42798w = new y();

        public y() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$13", f = "ClosetStore.kt", l = {565}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42799w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.h f42801y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(f.h hVar, ao.d<? super y0> dVar) {
            super(2, dVar);
            this.f42801y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y0(this.f42801y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42799w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.O;
                UpdateClosetImagesRequest a10 = this.f42801y.a();
                this.f42799w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class z extends jo.q implements io.l<ClosetBuyable, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final z f42802w = new z();

        public z() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(ClosetBuyable closetBuyable) {
            jo.p.h(closetBuyable, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ClosetStore$on$1", f = "ClosetStore.kt", l = {382}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class z0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42803w;

        public z0(ao.d<? super z0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42803w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = f.this.H;
                wn.v vVar = wn.v.f59242a;
                this.f42803w = 1;
                if (fVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public f(q8.a aVar, Resources resources, kf.v vVar, hf.v0 v0Var, hf.h<ud.p> hVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        jo.p.h(vVar, "tutorialPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(hVar, "closetPartsAdapterItemBindModelsSortHelper");
        this.f42706y = aVar;
        this.f42708z = resources;
        this.A = vVar;
        this.B = v0Var;
        this.C = hVar;
        this.D = uo.r0.b();
        aVar.b(this);
        this.E = wo.g.a(-2);
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(bool);
        this.F = e0Var;
        this.G = e0Var;
        this.H = wo.g.a(-2);
        this.I = wo.g.a(-2);
        this.J = wo.g.a(-2);
        this.K = wo.g.a(-2);
        this.L = wo.g.a(-2);
        this.M = wo.g.a(-2);
        this.N = wo.g.a(-2);
        this.O = wo.g.a(-2);
        this.P = new androidx.lifecycle.e0<>();
        androidx.lifecycle.e0<Closet> e0Var2 = new androidx.lifecycle.e0<>();
        this.Q = e0Var2;
        this.R = e0Var2;
        androidx.lifecycle.e0<ClosetAvatar> e0Var3 = new androidx.lifecycle.e0<>();
        this.S = e0Var3;
        this.T = e0Var3;
        androidx.lifecycle.e0<ClosetAvatarPartsResponse> e0Var4 = new androidx.lifecycle.e0<>();
        this.W = e0Var4;
        this.X = e0Var4;
        androidx.lifecycle.e0<List<Closet>> e0Var5 = new androidx.lifecycle.e0<>();
        this.Y = e0Var5;
        this.Z = e0Var5;
        androidx.lifecycle.e0<jf.c> e0Var6 = new androidx.lifecycle.e0<>();
        this.f42662a0 = e0Var6;
        this.f42664b0 = e0Var6;
        this.f42666c0 = jf.m0.GENDER;
        this.f42668d0 = jf.k0.GENDER;
        this.f42670e0 = "female";
        androidx.lifecycle.e0<Integer> e0Var7 = new androidx.lifecycle.e0<>();
        this.f42672f0 = e0Var7;
        this.f42674g0 = e0Var7;
        this.f42680j0 = 1;
        androidx.lifecycle.e0<List<jf.n0>> e0Var8 = new androidx.lifecycle.e0<>();
        this.f42682k0 = e0Var8;
        this.f42684l0 = e0Var8;
        androidx.lifecycle.e0<List<jf.l0>> e0Var9 = new androidx.lifecycle.e0<>();
        this.f42686m0 = e0Var9;
        this.f42688n0 = e0Var9;
        androidx.lifecycle.e0<List<ud.p>> e0Var10 = new androidx.lifecycle.e0<>();
        this.f42690o0 = e0Var10;
        this.f42692p0 = e0Var10;
        androidx.lifecycle.e0<List<ud.p>> e0Var11 = new androidx.lifecycle.e0<>();
        this.f42694q0 = e0Var11;
        this.f42696r0 = e0Var11;
        androidx.lifecycle.e0<List<ud.o>> e0Var12 = new androidx.lifecycle.e0<>();
        this.f42698s0 = e0Var12;
        this.f42700t0 = e0Var12;
        androidx.lifecycle.e0<Boolean> e0Var13 = new androidx.lifecycle.e0<>();
        this.f42702u0 = e0Var13;
        this.f42703v0 = e0Var13;
        androidx.lifecycle.e0<Boolean> e0Var14 = new androidx.lifecycle.e0<>();
        this.f42704w0 = e0Var14;
        this.f42705x0 = e0Var14;
        androidx.lifecycle.e0<Boolean> e0Var15 = new androidx.lifecycle.e0<>();
        this.f42707y0 = e0Var15;
        this.f42709z0 = e0Var15;
        androidx.lifecycle.e0<Boolean> e0Var16 = new androidx.lifecycle.e0<>();
        this.A0 = e0Var16;
        this.B0 = e0Var16;
        androidx.lifecycle.e0<Boolean> e0Var17 = new androidx.lifecycle.e0<>();
        this.C0 = e0Var17;
        this.D0 = e0Var17;
        androidx.lifecycle.e0<Boolean> e0Var18 = new androidx.lifecycle.e0<>();
        this.E0 = e0Var18;
        this.F0 = e0Var18;
        androidx.lifecycle.e0<Boolean> e0Var19 = new androidx.lifecycle.e0<>();
        this.G0 = e0Var19;
        this.H0 = e0Var19;
        androidx.lifecycle.e0<Integer> e0Var20 = new androidx.lifecycle.e0<>();
        this.I0 = e0Var20;
        this.J0 = e0Var20;
        androidx.lifecycle.e0<Boolean> e0Var21 = new androidx.lifecycle.e0<>(bool);
        this.K0 = e0Var21;
        this.L0 = e0Var21;
        androidx.lifecycle.e0<Boolean> e0Var22 = new androidx.lifecycle.e0<>(Boolean.TRUE);
        this.M0 = e0Var22;
        this.N0 = e0Var22;
        this.O0 = xn.s.k();
        this.P0 = new androidx.lifecycle.e0<>(new jf.p(null, 0, 0, null, 0, 31, null));
        androidx.lifecycle.e0<jf.n> e0Var23 = new androidx.lifecycle.e0<>(new jf.n(null, 1, null));
        this.Q0 = e0Var23;
        this.R0 = e0Var23;
        androidx.lifecycle.e0<List<ud.q>> e0Var24 = new androidx.lifecycle.e0<>();
        this.S0 = e0Var24;
        this.T0 = e0Var24;
        androidx.lifecycle.e0<List<ud.q>> e0Var25 = new androidx.lifecycle.e0<>();
        this.U0 = e0Var25;
        this.V0 = e0Var25;
        xo.r<Boolean> b10 = xo.y.b(0, 0, null, 7, null);
        this.W0 = b10;
        this.X0 = b10;
        xo.r<MRError> b11 = xo.y.b(0, 0, null, 7, null);
        this.Y0 = b11;
        this.Z0 = b11;
        androidx.lifecycle.e0<Boolean> e0Var26 = new androidx.lifecycle.e0<>();
        this.f42663a1 = e0Var26;
        this.f42665b1 = e0Var26;
        this.f42667c1 = new androidx.lifecycle.e0<>();
        androidx.lifecycle.e0<List<r3>> e0Var27 = new androidx.lifecycle.e0<>();
        this.f42669d1 = e0Var27;
        this.f42671e1 = e0Var27;
        androidx.lifecycle.e0<List<ud.p>> e0Var28 = new androidx.lifecycle.e0<>();
        this.f42673f1 = e0Var28;
        this.f42675g1 = e0Var28;
        androidx.lifecycle.e0<Boolean> e0Var29 = new androidx.lifecycle.e0<>(bool);
        this.f42677h1 = e0Var29;
        this.f42679i1 = e0Var29;
        androidx.lifecycle.e0<Boolean> e0Var30 = new androidx.lifecycle.e0<>(bool);
        this.f42681j1 = e0Var30;
        this.f42683k1 = e0Var30;
        xo.s<List<jf.d>> a10 = xo.i0.a(xn.s.k());
        this.f42685l1 = a10;
        this.f42687m1 = a10;
        this.f42689n1 = new nd.s0<>();
        this.f42691o1 = wo.g.a(-2);
        this.f42693p1 = wo.g.a(-2);
        this.f42695q1 = "";
        this.f42697r1 = wo.g.a(-2);
        androidx.lifecycle.e0<List<jf.k0>> e0Var31 = new androidx.lifecycle.e0<>(xn.s.k());
        this.f42699s1 = e0Var31;
        this.f42701t1 = e0Var31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean A1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = t.f42786w;
        }
        return fVar.z1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean B2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = r0.f42781w;
        }
        return fVar.A2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean C1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = u.f42788w;
        }
        return fVar.B1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean E1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = v.f42790w;
        }
        return fVar.D1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean E2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = s0.f42784w;
        }
        return fVar.D2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean G1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = w.f42792w;
        }
        return fVar.F1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean G2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = t0.f42787w;
        }
        return fVar.F2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean I1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = x.f42794w;
        }
        return fVar.H1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean I2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = u0.f42789w;
        }
        return fVar.H2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean K1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = y.f42798w;
        }
        return fVar.J1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean K2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = v0.f42791w;
        }
        return fVar.J2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean M1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = z.f42802w;
        }
        return fVar.L1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean M2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = w0.f42793w;
        }
        return fVar.L2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean O1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = a0.f42712w;
        }
        return fVar.N1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean Q0(f fVar, List list, io.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = c.f42720w;
        }
        return fVar.O0(list, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean R0(f fVar, jf.k0 k0Var, io.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = b.f42716w;
        }
        return fVar.P0(k0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean R1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = b0.f42717w;
        }
        return fVar.Q1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean T0(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = d.f42725w;
        }
        return fVar.S0(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean T1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = c0.f42721w;
        }
        return fVar.S1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean V0(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = e.f42730w;
        }
        return fVar.U0(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean V1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = d0.f42726w;
        }
        return fVar.U1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean X0(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C0633f.f42734w;
        }
        return fVar.W0(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean Y1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = e0.f42731w;
        }
        return fVar.X1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean Z0(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = g.f42738w;
        }
        return fVar.Y0(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean b2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f0.f42735w;
        }
        return fVar.a2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean c1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = h.f42742w;
        }
        return fVar.b1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean e1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = i.f42747w;
        }
        return fVar.d1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean e2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = g0.f42739w;
        }
        return fVar.d2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean g1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = j.f42752w;
        }
        return fVar.f1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean g2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = h0.f42743w;
        }
        return fVar.f2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean i1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = k.f42758w;
        }
        return fVar.h1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean i2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = i0.f42748w;
        }
        return fVar.h2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean k1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l.f42762w;
        }
        return fVar.j1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean k2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = j0.f42753w;
        }
        return fVar.j2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean m1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = m.f42765w;
        }
        return fVar.l1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean m2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = k0.f42759w;
        }
        return fVar.l2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = n.f42768w;
        }
        return fVar.n1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = l0.f42763w;
        }
        return fVar.n2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean q1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = o.f42771w;
        }
        return fVar.p1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean q2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = m0.f42766w;
        }
        return fVar.p2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean s1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = p.f42774w;
        }
        return fVar.r1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean s2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = n0.f42769w;
        }
        return fVar.r2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean u1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = q.f42777w;
        }
        return fVar.t1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean v2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = o0.f42772w;
        }
        return fVar.u2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean w1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = r.f42780w;
        }
        return fVar.v1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean x2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = p0.f42775w;
        }
        return fVar.w2(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean y1(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = s.f42783w;
        }
        return fVar.x1(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean z2(f fVar, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = q0.f42778w;
        }
        return fVar.y2(lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
        if (((r4 == null || (r4 = r4.getBothWeapons()) == null || !(r4.isEmpty() ^ true)) ? false : true) != false) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<jf.l0> A() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.A():java.util.List");
    }

    public final LiveData<jf.n> A0() {
        return this.R0;
    }

    public final boolean A2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getShoes() : null, lVar);
    }

    public final LiveData<Boolean> B() {
        return this.L0;
    }

    public final String B0() {
        return this.f42695q1;
    }

    public final boolean B1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getGlassesV2() : null, lVar);
    }

    public final ClosetAvatarBody C() {
        List<ClosetAvatarBody> bodies;
        ClosetAvatarPartsResponse f10 = this.W.f();
        Object obj = null;
        if (f10 == null || (bodies = f10.getBodies()) == null) {
            return null;
        }
        Iterator<T> it = bodies.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jo.p.c(((ClosetAvatarBody) next).getId(), this.f42670e0)) {
                obj = next;
                break;
            }
        }
        return (ClosetAvatarBody) obj;
    }

    public final LiveData<Boolean> C0() {
        return this.f42665b1;
    }

    public final LiveData<Boolean> C2() {
        return this.f42683k1;
    }

    public final LiveData<Boolean> D() {
        return this.H0;
    }

    public final LiveData<List<ud.p>> D0() {
        return this.f42675g1;
    }

    public final boolean D1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getHairOrnaments() : null, lVar);
    }

    public final boolean D2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getSocks() : null, lVar);
    }

    public final LiveData<List<ud.q>> E() {
        return this.T0;
    }

    public final LiveData<List<r3>> E0() {
        return this.f42671e1;
    }

    public final List<ud.q> F() {
        List<ud.q> U = U();
        ArrayList arrayList = new ArrayList();
        for (Object obj : U) {
            if (((ud.q) obj).x()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final xo.w<Boolean> F0() {
        return this.X0;
    }

    public final boolean F1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getHairs() : null, lVar);
    }

    public final boolean F2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getTops() : null, lVar);
    }

    public final boolean G() {
        return this.f42678i0;
    }

    public final LiveData<Boolean> G0() {
        return this.D0;
    }

    public final wo.x<wn.v> H() {
        return this.f42697r1.g();
    }

    public final LiveData<List<jf.k0>> H0() {
        return this.f42701t1;
    }

    public final boolean H1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getHatsV2() : null, lVar);
    }

    public final boolean H2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getWeapons() : null, lVar);
    }

    public final LiveData<jf.c> I() {
        return this.f42664b0;
    }

    public final xo.c<wn.v> I0() {
        return xo.e.a(this.E);
    }

    public final LiveData<ClosetAvatarPartsResponse> J() {
        return this.X;
    }

    public final boolean J0() {
        boolean z10;
        List<ud.q> U = U();
        if (!(U instanceof Collection) || !U.isEmpty()) {
            for (ud.q qVar : U) {
                if (qVar.B() && qVar.x()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean J1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getHats() : null, lVar);
    }

    public final boolean J2(io.l<? super ClosetBuyable, Boolean> lVar) {
        return W1(lVar) || t2(lVar) || a1(lVar);
    }

    public final LiveData<List<Closet>> K() {
        return this.Z;
    }

    public final boolean K0() {
        return !F().isEmpty();
    }

    public final LiveData<List<ud.o>> L() {
        return this.f42700t0;
    }

    public final boolean L0() {
        List<ud.q> U = U();
        ArrayList arrayList = new ArrayList();
        for (Object obj : U) {
            ud.q qVar = (ud.q) obj;
            if (qVar.q() && qVar.E()) {
                arrayList.add(obj);
            }
        }
        return xn.a0.L(arrayList);
    }

    public final boolean L1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getHeadBands() : null, lVar);
    }

    public final boolean L2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getWings() : null, lVar);
    }

    public final List<jf.l0> M() {
        List<ClosetBuyableAccessoryAsset> pets;
        List<ClosetBuyableAccessoryAsset> backWings;
        List<ClosetBuyableAccessoryAsset> wings;
        List<ClosetBuyableAccessoryAsset> scarfs;
        List<ClosetBuyableAsset> shoes;
        List<ClosetBuyableAsset> socks;
        List<ClosetBuyableAsset> bottoms;
        List<ClosetBuyableAsset> tops;
        List<ClosetBuyableSetupClothes> onepieces;
        List<ClosetBuyableSetupClothes> setupClothes;
        ArrayList arrayList = new ArrayList();
        ClosetAvatarBody C = C();
        boolean z10 = false;
        if ((C == null || (setupClothes = C.getSetupClothes()) == null || !(setupClothes.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.SETUP_CLOTHES, nd.y0.ic_avatar_setup_clothes, z2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (onepieces = C.getOnepieces()) == null || !(onepieces.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.ONEPIECE, nd.y0.ic_avatar_onepiece, m2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (tops = C.getTops()) == null || !(tops.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.TOPS, nd.y0.ic_avatar_top, G2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (bottoms = C.getBottoms()) == null || !(bottoms.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.BOTTOMS, nd.y0.ic_avatar_bottom, c1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (socks = C.getSocks()) == null || !(socks.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.SOCKS, nd.y0.ic_avatar_socks, E2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (shoes = C.getShoes()) == null || !(shoes.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.SHOES, nd.y0.ic_avatar_shoes, B2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (scarfs = C.getScarfs()) == null || !(scarfs.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.SCARF, nd.y0.ic_avatar_scarf, x2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (wings = C.getWings()) == null || !(wings.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.WING, nd.y0.ic_avatar_wing, M2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (backWings = C.getBackWings()) == null || !(backWings.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.BACK_WING, nd.y0.ic_avatar_back_wing, V0(this, null, 1, null), false, 8, null));
        }
        if (C != null && (pets = C.getPets()) != null && (!pets.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            arrayList.add(new jf.l0(jf.k0.PET, nd.y0.ic_avatar_pet, o2(this, null, 1, null), false, 8, null));
        }
        return xn.a0.B0(arrayList);
    }

    public final LiveData<Boolean> M0() {
        return this.G;
    }

    public final ClosetAvatar N() {
        return this.U;
    }

    public final LiveData<Boolean> N0() {
        return this.N0;
    }

    public final boolean N1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getHeads() : null, lVar);
    }

    public final LiveData<Boolean> N2() {
        return this.f42703v0;
    }

    public final LiveData<Closet> O() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O0(java.util.List<? extends com.dena.mirrativ.mirrativapi.closet.ClosetBuyable> r9, io.l<? super com.dena.mirrativ.mirrativapi.closet.ClosetBuyable, java.lang.Boolean> r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        Le:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r9.next()
            java.lang.Object r5 = r10.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Le
            r3.add(r4)
            goto Le
        L28:
            java.util.Iterator r9 = r3.iterator()
        L2c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L70
            java.lang.Object r10 = r9.next()
            r3 = r10
            com.dena.mirrativ.mirrativapi.closet.ClosetBuyable r3 = (com.dena.mirrativ.mirrativapi.closet.ClosetBuyable) r3
            java.lang.Integer r4 = r3.isBuyable()
            if (r4 != 0) goto L40
            goto L6c
        L40:
            int r4 = r4.intValue()
            if (r4 != 0) goto L6c
            java.lang.Long r4 = r3.getUpdatedAt()
            if (r4 == 0) goto L51
            long r4 = r4.longValue()
            goto L53
        L51:
            r4 = 0
        L53:
            r6 = 1575126000(0x5de283f0, double:7.782156445E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L6c
            hf.v0 r4 = r8.B
            java.lang.String r5 = r3.getIconUrl()
            boolean r3 = r3.isTrial()
            boolean r3 = r4.o(r5, r3)
            if (r3 != 0) goto L6c
            r3 = r0
            goto L6d
        L6c:
            r3 = r1
        L6d:
            if (r3 == 0) goto L2c
            r2 = r10
        L70:
            com.dena.mirrativ.mirrativapi.closet.ClosetBuyable r2 = (com.dena.mirrativ.mirrativapi.closet.ClosetBuyable) r2
        L72:
            if (r2 == 0) goto L75
            goto L76
        L75:
            r0 = r1
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.O0(java.util.List, io.l):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O2() {
        /*
            r7 = this;
            jf.m0 r0 = r7.f42666c0
            jf.m0 r1 = jf.m0.COMPANION
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L6e
            jf.k0 r0 = r7.f42668d0
            jf.k0 r1 = jf.k0.COMPANION
            if (r0 != r1) goto L6e
            androidx.lifecycle.e0<com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse> r0 = r7.W
            java.lang.Object r0 = r0.f()
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse r0 = (com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse) r0
            if (r0 == 0) goto L6a
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatarCompanion r0 = r0.getCompanion()
            if (r0 == 0) goto L6a
            java.util.List r0 = r0.getTypes()
            if (r0 == 0) goto L6a
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            r4 = 0
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset r5 = (com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset) r5
            java.lang.String r5 = r5.getId()
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r6 = r7.V
            if (r6 == 0) goto L4c
            com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset r6 = r6.getCompanionType()
            if (r6 == 0) goto L4c
            int r4 = r6.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L4c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = jo.p.c(r5, r4)
            if (r4 == 0) goto L28
            r4 = r1
        L57:
            com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset r4 = (com.dena.mirrativ.mirrativapi.closet.ClosetBuyableAccessoryAsset) r4
            if (r4 == 0) goto L6a
            java.lang.Integer r0 = r4.isBuyable()
            if (r0 != 0) goto L62
            goto L6a
        L62:
            int r0 = r0.intValue()
            if (r0 != 0) goto L6a
            r0 = r2
            goto L6b
        L6a:
            r0 = r3
        L6b:
            if (r0 == 0) goto L6e
            goto L6f
        L6e:
            r2 = r3
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.O2():boolean");
    }

    public final androidx.lifecycle.e0<jf.p> P() {
        return this.P0;
    }

    public final boolean P0(jf.k0 k0Var, io.l<? super ClosetBuyable, Boolean> lVar) {
        switch (a.f42710a[k0Var.ordinal()]) {
            case 1:
                return v1(lVar);
            case 2:
                return Y0(lVar);
            case 3:
                return f1(lVar);
            case 4:
                return t1(lVar);
            case 5:
                return X1(lVar);
            case 6:
                return n2(lVar);
            case 7:
                return J1(lVar);
            case 8:
                return z1(lVar);
            case 9:
                return w2(lVar);
            case 10:
                return H2(lVar);
            case 11:
                return L2(lVar);
            case 12:
            case 13:
            case 14:
            case 15:
                return h1(lVar);
            case 16:
                return U0(lVar);
            case 17:
                return n1(lVar);
            case 18:
                return U1(lVar);
            case 19:
                return d1(lVar);
            case 20:
                return r2(lVar);
            case 21:
                return H1(lVar);
            case 22:
                return D1(lVar);
            case 23:
                return L1(lVar);
            case 24:
                return B1(lVar);
            case 25:
                return a2(lVar);
            case 26:
                return l1(lVar);
            case 27:
                return W1(lVar);
            case 28:
                return t2(lVar);
            case 29:
                return a1(lVar);
            case 30:
                return S1(lVar);
            case 31:
                return h2(lVar);
            case 32:
                return false;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                return d2(lVar);
            case 38:
                return p2(lVar);
            case 39:
                return N1(lVar);
            case 40:
                return F1(lVar);
            case 41:
                return p1(lVar);
            case 42:
                return r1(lVar);
            case 43:
                return j2(lVar);
            case 44:
                return f2(lVar);
            case 45:
                return y2(lVar);
            case 46:
                return l2(lVar);
            case 47:
                return F2(lVar);
            case 48:
                return b1(lVar);
            case 49:
                return D2(lVar);
            case 50:
                return A2(lVar);
            case 51:
                return W0(lVar);
            case 52:
                return Z1(lVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final LiveData<Boolean> P1() {
        return this.f42679i1;
    }

    public final LiveData<Boolean> P2() {
        return this.f42705x0;
    }

    public final boolean Q() {
        return this.f42676h0;
    }

    public final boolean Q1(io.l<? super ClosetBuyable, Boolean> lVar) {
        return d2(lVar) || x1(lVar) || j1(lVar) || S0(lVar) || u2(lVar) || h1(lVar);
    }

    public final LiveData<Boolean> Q2() {
        return this.f42709z0;
    }

    public final ClosetAvatar R() {
        return this.V;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0bda  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R2() {
        /*
            Method dump skipped, instructions count: 3280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.R2():void");
    }

    public final LiveData<List<ud.q>> S() {
        return this.V0;
    }

    public final boolean S0(io.l<? super ClosetBuyable, Boolean> lVar) {
        return J1(lVar) || H1(lVar) || D1(lVar) || L1(lVar) || z1(lVar) || B1(lVar) || a2(lVar) || l1(lVar) || S1(lVar) || h2(lVar) || H2(lVar) || J2(lVar) || v1(lVar);
    }

    public final boolean S1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getKemomimis() : null, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175 A[LOOP:2: B:62:0x016f->B:64:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101 A[EDGE_INSN: B:67:0x0101->B:44:0x0101 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S2() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.S2():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
        if (r6 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ud.q> T() {
        /*
            r7 = this;
            java.util.List r0 = r7.U()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r0.next()
            r3 = r2
            ud.q r3 = (ud.q) r3
            jf.k0 r3 = r3.l()
            int[] r4 = nf.f.a.f42710a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r3) {
                case 46: goto L72;
                case 47: goto L5b;
                case 48: goto L44;
                case 49: goto L39;
                case 50: goto L2e;
                default: goto L2c;
            }
        L2c:
            r4 = r5
            goto L7d
        L2e:
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L36
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r6 = r3.getSetupClothes()
        L36:
            if (r6 != 0) goto L7d
            goto L2c
        L39:
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L41
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r6 = r3.getSetupClothes()
        L41:
            if (r6 != 0) goto L7d
            goto L2c
        L44:
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L4d
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r3 = r3.getSetupClothes()
            goto L4e
        L4d:
            r3 = r6
        L4e:
            if (r3 != 0) goto L7d
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L58
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r6 = r3.getOnepiece()
        L58:
            if (r6 != 0) goto L7d
            goto L2c
        L5b:
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L64
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r3 = r3.getSetupClothes()
            goto L65
        L64:
            r3 = r6
        L65:
            if (r3 != 0) goto L7d
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L6f
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r6 = r3.getOnepiece()
        L6f:
            if (r6 != 0) goto L7d
            goto L2c
        L72:
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r3 = r7.V
            if (r3 == 0) goto L7a
            com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset r6 = r3.getSetupClothes()
        L7a:
            if (r6 != 0) goto L7d
            goto L2c
        L7d:
            if (r4 == 0) goto Ld
            r1.add(r2)
            goto Ld
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.T():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (jo.p.c(r4, java.lang.String.valueOf(r5)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (jo.p.c(r4, java.lang.String.valueOf(r5)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
        if (jo.p.c(r4, java.lang.String.valueOf(r5)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
        if (jo.p.c(r4, java.lang.String.valueOf(r5)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
        if (jo.p.c(r4, java.lang.String.valueOf(r5)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ud.q> T2(java.util.List<ud.q> r8, jf.k0 r9) {
        /*
            Method dump skipped, instructions count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.T2(java.util.List, jf.k0):java.util.List");
    }

    public final List<ud.q> U() {
        String valueOf;
        Object obj;
        ClosetAvatar closetAvatar = this.V;
        if (closetAvatar == null) {
            return xn.s.k();
        }
        jf.k0[] values = jf.k0.values();
        ArrayList arrayList = new ArrayList();
        for (jf.k0 k0Var : values) {
            switch (a.f42710a[k0Var.ordinal()]) {
                case 1:
                    ClosetAsset facePaint = closetAvatar.getFacePaint();
                    valueOf = String.valueOf(facePaint != null ? Integer.valueOf(facePaint.getId()) : null);
                    break;
                case 2:
                    ClosetAsset beard = closetAvatar.getBeard();
                    valueOf = String.valueOf(beard != null ? Integer.valueOf(beard.getId()) : null);
                    break;
                case 3:
                    ClosetAsset cheek = closetAvatar.getCheek();
                    valueOf = String.valueOf(cheek != null ? Integer.valueOf(cheek.getId()) : null);
                    break;
                case 4:
                    ClosetAsset eyeshadow = closetAvatar.getEyeshadow();
                    valueOf = String.valueOf(eyeshadow != null ? Integer.valueOf(eyeshadow.getId()) : null);
                    break;
                case 5:
                    ClosetAsset lip = closetAvatar.getLip();
                    valueOf = String.valueOf(lip != null ? Integer.valueOf(lip.getId()) : null);
                    break;
                case 6:
                    ClosetAccessoryAsset pet = closetAvatar.getPet();
                    valueOf = String.valueOf(pet != null ? Integer.valueOf(pet.getId()) : null);
                    break;
                case 7:
                    ClosetAccessoryAsset hat = closetAvatar.getHat();
                    valueOf = String.valueOf(hat != null ? Integer.valueOf(hat.getId()) : null);
                    break;
                case 8:
                    ClosetAccessoryAsset glasses = closetAvatar.getGlasses();
                    valueOf = String.valueOf(glasses != null ? Integer.valueOf(glasses.getId()) : null);
                    break;
                case 9:
                    ClosetAccessoryAsset scarf = closetAvatar.getScarf();
                    valueOf = String.valueOf(scarf != null ? Integer.valueOf(scarf.getId()) : null);
                    break;
                case 10:
                    ClosetAccessoryAsset weapon = closetAvatar.getWeapon();
                    valueOf = String.valueOf(weapon != null ? Integer.valueOf(weapon.getId()) : null);
                    break;
                case 11:
                    ClosetAccessoryAsset wing = closetAvatar.getWing();
                    valueOf = String.valueOf(wing != null ? Integer.valueOf(wing.getId()) : null);
                    break;
                case 12:
                    ClosetAccessoryAsset companionType = closetAvatar.getCompanionType();
                    valueOf = String.valueOf(companionType != null ? Integer.valueOf(companionType.getId()) : null);
                    break;
                case 13:
                    ClosetAccessoryAsset companionTops = closetAvatar.getCompanionTops();
                    valueOf = String.valueOf(companionTops != null ? Integer.valueOf(companionTops.getId()) : null);
                    break;
                case 14:
                    ClosetAccessoryAsset companionHat = closetAvatar.getCompanionHat();
                    valueOf = String.valueOf(companionHat != null ? Integer.valueOf(companionHat.getId()) : null);
                    break;
                case 15:
                    ClosetAccessoryAsset companionScarf = closetAvatar.getCompanionScarf();
                    valueOf = String.valueOf(companionScarf != null ? Integer.valueOf(companionScarf.getId()) : null);
                    break;
                case 16:
                    ClosetAccessoryAsset backWing = closetAvatar.getBackWing();
                    valueOf = String.valueOf(backWing != null ? Integer.valueOf(backWing.getId()) : null);
                    break;
                case 17:
                    ClosetAccessoryAsset effect = closetAvatar.getEffect();
                    valueOf = String.valueOf(effect != null ? Integer.valueOf(effect.getId()) : null);
                    break;
                case 18:
                    ClosetAccessoryAsset leftInterior = closetAvatar.getLeftInterior();
                    valueOf = String.valueOf(leftInterior != null ? Integer.valueOf(leftInterior.getId()) : null);
                    break;
                case 19:
                    ClosetAccessoryAsset centerInterior = closetAvatar.getCenterInterior();
                    valueOf = String.valueOf(centerInterior != null ? Integer.valueOf(centerInterior.getId()) : null);
                    break;
                case 20:
                    ClosetAccessoryAsset rightInterior = closetAvatar.getRightInterior();
                    valueOf = String.valueOf(rightInterior != null ? Integer.valueOf(rightInterior.getId()) : null);
                    break;
                case 21:
                    ClosetAccessoryAsset hatV2 = closetAvatar.getHatV2();
                    valueOf = String.valueOf(hatV2 != null ? Integer.valueOf(hatV2.getId()) : null);
                    break;
                case 22:
                    ClosetAccessoryAsset hairOrnament = closetAvatar.getHairOrnament();
                    valueOf = String.valueOf(hairOrnament != null ? Integer.valueOf(hairOrnament.getId()) : null);
                    break;
                case 23:
                    ClosetAccessoryAsset headBand = closetAvatar.getHeadBand();
                    valueOf = String.valueOf(headBand != null ? Integer.valueOf(headBand.getId()) : null);
                    break;
                case 24:
                    ClosetAccessoryAsset glassesV2 = closetAvatar.getGlassesV2();
                    valueOf = String.valueOf(glassesV2 != null ? Integer.valueOf(glassesV2.getId()) : null);
                    break;
                case 25:
                    ClosetAccessoryAsset mask = closetAvatar.getMask();
                    valueOf = String.valueOf(mask != null ? Integer.valueOf(mask.getId()) : null);
                    break;
                case 26:
                    ClosetAccessoryAsset earring = closetAvatar.getEarring();
                    valueOf = String.valueOf(earring != null ? Integer.valueOf(earring.getId()) : null);
                    break;
                case 27:
                    ClosetAccessoryAsset leftWeapon = closetAvatar.getLeftWeapon();
                    valueOf = String.valueOf(leftWeapon != null ? Integer.valueOf(leftWeapon.getId()) : null);
                    break;
                case 28:
                    ClosetAccessoryAsset rightWeapon = closetAvatar.getRightWeapon();
                    valueOf = String.valueOf(rightWeapon != null ? Integer.valueOf(rightWeapon.getId()) : null);
                    break;
                case 29:
                    ClosetAccessoryAsset bothWeapon = closetAvatar.getBothWeapon();
                    valueOf = String.valueOf(bothWeapon != null ? Integer.valueOf(bothWeapon.getId()) : null);
                    break;
                case 30:
                    ClosetAccessoryAsset kemomimi = closetAvatar.getKemomimi();
                    valueOf = String.valueOf(kemomimi != null ? Integer.valueOf(kemomimi.getId()) : null);
                    break;
                case 31:
                    ClosetAccessoryAsset necklace = closetAvatar.getNecklace();
                    valueOf = String.valueOf(necklace != null ? Integer.valueOf(necklace.getId()) : null);
                    break;
                case 32:
                    valueOf = closetAvatar.getBodyId();
                    break;
                case 33:
                    ClosetAvatarSimpleValue persona = closetAvatar.getPersona();
                    if (persona != null) {
                        valueOf = persona.getId();
                        break;
                    }
                    valueOf = null;
                    break;
                case 34:
                    ClosetAvatarSimpleValue motion1 = closetAvatar.getMotion1();
                    valueOf = String.valueOf(motion1 != null ? motion1.getId() : null);
                    break;
                case 35:
                    ClosetAvatarSimpleValue motion2 = closetAvatar.getMotion2();
                    valueOf = String.valueOf(motion2 != null ? motion2.getId() : null);
                    break;
                case 36:
                    ClosetAvatarSimpleValue motion3 = closetAvatar.getMotion3();
                    valueOf = String.valueOf(motion3 != null ? motion3.getId() : null);
                    break;
                case 37:
                    ClosetAvatarSimpleValue motion4 = closetAvatar.getMotion4();
                    valueOf = String.valueOf(motion4 != null ? motion4.getId() : null);
                    break;
                case 38:
                    ClosetAvatarSimpleValue proportion = closetAvatar.getProportion();
                    if (proportion != null) {
                        valueOf = proportion.getId();
                        break;
                    }
                    valueOf = null;
                    break;
                case 39:
                    ClosetAsset head = closetAvatar.getHead();
                    valueOf = String.valueOf(head != null ? Integer.valueOf(head.getId()) : null);
                    break;
                case 40:
                    ClosetAsset hair = closetAvatar.getHair();
                    valueOf = String.valueOf(hair != null ? Integer.valueOf(hair.getId()) : null);
                    break;
                case 41:
                    ClosetAsset eyebrow = closetAvatar.getEyebrow();
                    valueOf = String.valueOf(eyebrow != null ? Integer.valueOf(eyebrow.getId()) : null);
                    break;
                case 42:
                    ClosetAsset eye = closetAvatar.getEye();
                    valueOf = String.valueOf(eye != null ? Integer.valueOf(eye.getId()) : null);
                    break;
                case 43:
                    ClosetAsset nose = closetAvatar.getNose();
                    valueOf = String.valueOf(nose != null ? Integer.valueOf(nose.getId()) : null);
                    break;
                case 44:
                    ClosetAsset mouth = closetAvatar.getMouth();
                    valueOf = String.valueOf(mouth != null ? Integer.valueOf(mouth.getId()) : null);
                    break;
                case 45:
                    ClosetSetupClotheAsset setupClothes = closetAvatar.getSetupClothes();
                    valueOf = String.valueOf(setupClothes != null ? Integer.valueOf(setupClothes.getId()) : null);
                    break;
                case 46:
                    ClosetSetupClotheAsset onepiece = closetAvatar.getOnepiece();
                    valueOf = String.valueOf(onepiece != null ? Integer.valueOf(onepiece.getId()) : null);
                    break;
                case 47:
                    ClosetAsset tops = closetAvatar.getTops();
                    valueOf = String.valueOf(tops != null ? Integer.valueOf(tops.getId()) : null);
                    break;
                case 48:
                    ClosetAsset bottoms = closetAvatar.getBottoms();
                    valueOf = String.valueOf(bottoms != null ? Integer.valueOf(bottoms.getId()) : null);
                    break;
                case 49:
                    ClosetAsset socks = closetAvatar.getSocks();
                    valueOf = String.valueOf(socks != null ? Integer.valueOf(socks.getId()) : null);
                    break;
                case 50:
                    ClosetAsset shoes = closetAvatar.getShoes();
                    valueOf = String.valueOf(shoes != null ? Integer.valueOf(shoes.getId()) : null);
                    break;
                case 51:
                    ClosetBackground background = closetAvatar.getBackground();
                    valueOf = String.valueOf(background != null ? Integer.valueOf(background.getId()) : null);
                    break;
                case 52:
                    ClosetAccessoryAsset machine = closetAvatar.getMachine();
                    valueOf = String.valueOf(machine != null ? Integer.valueOf(machine.getId()) : null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = m0(k0Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    obj = jo.p.c(((ud.q) next).j(), valueOf == null ? "" : valueOf) ? next : null;
                }
            }
            ud.q qVar = (ud.q) obj;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    public final boolean U0(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getBackWings() : null, lVar);
    }

    public final boolean U1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getLeftInteriors() : null, lVar);
    }

    public final void U2() {
        if (K0()) {
            androidx.lifecycle.e0<Boolean> e0Var = this.f42663a1;
            Boolean bool = Boolean.TRUE;
            e0Var.p(bool);
            androidx.lifecycle.e0<Boolean> e0Var2 = this.A0;
            Boolean bool2 = Boolean.FALSE;
            e0Var2.p(bool2);
            this.C0.p(bool2);
            this.E0.p(bool);
            this.G0.p(Boolean.valueOf(J0()));
            this.I0.p(Integer.valueOf(y()));
            return;
        }
        boolean L0 = L0();
        androidx.lifecycle.e0<Boolean> e0Var3 = this.f42663a1;
        Boolean bool3 = Boolean.TRUE;
        e0Var3.p(bool3);
        this.A0.p(Boolean.valueOf(!L0));
        this.C0.p(Boolean.valueOf(L0));
        this.E0.p(bool3);
        this.G0.p(Boolean.FALSE);
        this.I0.p(0);
    }

    public final List<jf.l0> V() {
        List<ClosetBuyableAsset> beards;
        List<ClosetBuyableAsset> lips;
        List<ClosetBuyableAsset> mouths;
        List<ClosetBuyableAsset> noses;
        List<ClosetBuyableAsset> cheeks;
        List<ClosetBuyableAsset> eyeshadows;
        List<ClosetBuyableAsset> eyes;
        List<ClosetBuyableAsset> eyebrows;
        List<ClosetBuyableAsset> hairs;
        List<ClosetBuyableAsset> heads;
        List<ClosetAvatarSimpleValue> proportions;
        ArrayList arrayList = new ArrayList();
        ClosetAvatarBody C = C();
        boolean z10 = false;
        if ((C == null || (proportions = C.getProportions()) == null || !(proportions.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.PROPOTION, nd.y0.ic_avatar_proportion, q2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (heads = C.getHeads()) == null || !(heads.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.HEAD, nd.y0.ic_avatar_head, O1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (hairs = C.getHairs()) == null || !(hairs.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.HAIR, nd.y0.ic_avatar_hair, G1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (eyebrows = C.getEyebrows()) == null || !(eyebrows.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.EYEBROW, nd.y0.ic_avatar_eyebrow, q1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (eyes = C.getEyes()) == null || !(eyes.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.EYE, nd.y0.ic_avatar_eye, s1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (eyeshadows = C.getEyeshadows()) == null || !(eyeshadows.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.EYESHADOW, nd.y0.ic_avatar_eyeshadow, u1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (cheeks = C.getCheeks()) == null || !(cheeks.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.CHEEK, nd.y0.ic_avatar_cheek, g1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (noses = C.getNoses()) == null || !(noses.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.NOSE, nd.y0.ic_avatar_nose, k2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (mouths = C.getMouths()) == null || !(mouths.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.MOUTH, nd.y0.ic_avatar_mouth, g2(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (lips = C.getLips()) == null || !(lips.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.LIP, nd.y0.ic_avatar_lip, Y1(this, null, 1, null), false, 8, null));
        }
        if (C != null && (beards = C.getBeards()) != null && (!beards.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            arrayList.add(new jf.l0(jf.k0.BEARD, nd.y0.ic_avatar_beard, Z0(this, null, 1, null), false, 8, null));
        }
        return xn.a0.B0(arrayList);
    }

    public final void V2(AvatarPart avatarPart, List<? extends ClosetBuyable> list) {
        if (list != null) {
            for (ClosetBuyable closetBuyable : list) {
                if (jo.p.c(String.valueOf(avatarPart.getId()), closetBuyable.getId())) {
                    closetBuyable.setBuyable(0);
                    closetBuyable.setUpdatedAt(Long.valueOf(avatarPart.getUpdatedAt()));
                    this.B.a(closetBuyable.getIconUrl(), closetBuyable.isTrial());
                }
            }
        }
    }

    public final xo.w<MRError> W() {
        return this.Z0;
    }

    public final boolean W0(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getBackgrounds() : null, lVar);
    }

    public final boolean W1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getLeftWeapons() : null, lVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1968
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void W2(java.lang.String r11, jf.k0 r12) {
        /*
            Method dump skipped, instructions count: 8124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.W2(java.lang.String, jf.k0):void");
    }

    public final xo.c<Integer> X() {
        return xo.e.a(this.I);
    }

    public final boolean X1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getLips() : null, lVar);
    }

    public final xo.c<wn.v> Y() {
        return xo.e.a(this.J);
    }

    public final boolean Y0(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getBeards() : null, lVar);
    }

    public final xo.c<wn.v> Z() {
        return xo.e.a(this.H);
    }

    public final boolean Z1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getMachines() : null, lVar);
    }

    public final xo.c<UpdateClosetImagesRequest> a0() {
        return xo.e.a(this.O);
    }

    public final boolean a1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getBothWeapons() : null, lVar);
    }

    public final boolean a2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getMasks() : null, lVar);
    }

    public final xo.c<Integer> b0() {
        return xo.e.a(this.L);
    }

    public final boolean b1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getBottoms() : null, lVar);
    }

    public final xo.c<UpdateClosetImagesRequest> c0() {
        return xo.e.a(this.N);
    }

    public final boolean c2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getMotions() : null, lVar);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.f42706y.c(this);
        super.d();
    }

    public final xo.c<UpdateClosetNameRequest> d0() {
        return xo.e.a(this.K);
    }

    public final boolean d1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getCenterInteriors() : null, lVar);
    }

    public final boolean d2(io.l<? super ClosetBuyable, Boolean> lVar) {
        return c2(lVar);
    }

    public final xo.c<MRError> e0() {
        return xo.e.a(this.M);
    }

    public final Integer f0(jf.k0 k0Var) {
        int i10 = a.f42710a[k0Var.ordinal()];
        switch (i10) {
            case 1:
                return Integer.valueOf(nd.y0.ic_avatar_face_paint);
            case 2:
                return Integer.valueOf(nd.y0.ic_avatar_beard);
            case 3:
                return Integer.valueOf(nd.y0.ic_avatar_cheek);
            case 4:
                return Integer.valueOf(nd.y0.ic_avatar_eyeshadow);
            case 5:
                return Integer.valueOf(nd.y0.ic_avatar_lip);
            case 6:
                return Integer.valueOf(nd.y0.ic_avatar_pet);
            case 7:
                return Integer.valueOf(nd.y0.ic_avatar_hat);
            case 8:
                return Integer.valueOf(nd.y0.ic_avatar_glasses);
            case 9:
                return Integer.valueOf(nd.y0.ic_avatar_scarf);
            case 10:
                return Integer.valueOf(nd.y0.ic_avatar_weapon);
            case 11:
                return Integer.valueOf(nd.y0.ic_avatar_wing);
            case 12:
                return Integer.valueOf(nd.y0.ic_avatar_companion_type_status);
            case 13:
                return Integer.valueOf(nd.y0.ic_avatar_companion_tops_status);
            case 14:
                return Integer.valueOf(nd.y0.ic_avatar_hat);
            case 15:
                return Integer.valueOf(nd.y0.ic_avatar_companion_scarf_status);
            case 16:
                return Integer.valueOf(nd.y0.ic_avatar_back_wing);
            case 17:
                return Integer.valueOf(nd.y0.ic_avatar_effect);
            case 18:
                return Integer.valueOf(nd.y0.ic_avatar_left_interior);
            case 19:
                return Integer.valueOf(nd.y0.ic_avatar_center_interior);
            case 20:
                return Integer.valueOf(nd.y0.ic_avatar_right_interior);
            case 21:
                return Integer.valueOf(nd.y0.ic_avatar_hat);
            case 22:
                return Integer.valueOf(nd.y0.ic_avatar_hair_ornament);
            case 23:
                return Integer.valueOf(nd.y0.ic_avatar_head_band);
            case 24:
                return Integer.valueOf(nd.y0.ic_avatar_glasses);
            case 25:
                return Integer.valueOf(nd.y0.ic_avatar_mask);
            case 26:
                return Integer.valueOf(nd.y0.ic_avatar_earring);
            case 27:
                return Integer.valueOf(nd.y0.ic_avatar_weapon);
            case 28:
                return Integer.valueOf(nd.y0.ic_avatar_weapon);
            case 29:
                return Integer.valueOf(nd.y0.ic_avatar_weapon);
            case 30:
                return Integer.valueOf(nd.y0.ic_avatar_kemomimi);
            case 31:
                return Integer.valueOf(nd.y0.ic_avatar_necklace);
            default:
                switch (i10) {
                    case 38:
                        return Integer.valueOf(nd.y0.ic_avatar_proportion);
                    case 39:
                        return Integer.valueOf(nd.y0.ic_avatar_head);
                    case 40:
                        return Integer.valueOf(nd.y0.ic_avatar_hair);
                    case 41:
                        return Integer.valueOf(nd.y0.ic_avatar_eyebrow);
                    case 42:
                        return Integer.valueOf(nd.y0.ic_avatar_eye);
                    case 43:
                        return Integer.valueOf(nd.y0.ic_avatar_nose);
                    case 44:
                        return Integer.valueOf(nd.y0.ic_avatar_mouth);
                    case 45:
                        return Integer.valueOf(nd.y0.ic_avatar_setup_clothes);
                    case 46:
                        return Integer.valueOf(nd.y0.ic_avatar_onepiece);
                    case 47:
                        return Integer.valueOf(nd.y0.ic_avatar_top);
                    case 48:
                        return Integer.valueOf(nd.y0.ic_avatar_bottom);
                    case 49:
                        return Integer.valueOf(nd.y0.ic_avatar_socks);
                    case 50:
                        return Integer.valueOf(nd.y0.ic_avatar_shoes);
                    case 51:
                        return Integer.valueOf(nd.y0.ic_avatar_background);
                    case 52:
                        return Integer.valueOf(nd.y0.ic_avatar_machine);
                    default:
                        return null;
                }
        }
    }

    public final boolean f1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getCheeks() : null, lVar);
    }

    public final boolean f2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getMouths() : null, lVar);
    }

    public final boolean g0() {
        Boolean b10 = this.f42689n1.b();
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.D.getCoroutineContext();
    }

    public final wo.x<Boolean> h0() {
        return this.f42689n1.c();
    }

    public final boolean h1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarCompanion companion;
        ClosetAvatarCompanion companion2;
        ClosetAvatarCompanion companion3;
        ClosetAvatarCompanion companion4;
        ClosetAvatarPartsResponse f10 = this.W.f();
        List<ClosetBuyableAccessoryAsset> list = null;
        if (!Q0(this, (f10 == null || (companion4 = f10.getCompanion()) == null) ? null : companion4.getTypes(), null, 2, null)) {
            ClosetAvatarPartsResponse f11 = this.W.f();
            if (!O0((f11 == null || (companion3 = f11.getCompanion()) == null) ? null : companion3.getTops(), lVar)) {
                ClosetAvatarPartsResponse f12 = this.W.f();
                if (!O0((f12 == null || (companion2 = f12.getCompanion()) == null) ? null : companion2.getHats(), lVar)) {
                    ClosetAvatarPartsResponse f13 = this.W.f();
                    if (f13 != null && (companion = f13.getCompanion()) != null) {
                        list = companion.getScarfs();
                    }
                    if (!O0(list, lVar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean h2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getNecklaces() : null, lVar);
    }

    public final xo.c<wn.v> i0() {
        return xo.e.a(this.f42693p1);
    }

    public final LiveData<List<ud.p>> j0() {
        return this.f42696r0;
    }

    public final boolean j1(io.l<? super ClosetBuyable, Boolean> lVar) {
        return y2(lVar) || l2(lVar) || F2(lVar) || b1(lVar) || D2(lVar) || A2(lVar) || L2(lVar) || w2(lVar) || n2(lVar) || L2(lVar) || U0(lVar);
    }

    public final boolean j2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getNoses() : null, lVar);
    }

    public final wo.x<p2> k0() {
        return this.f42691o1.g();
    }

    public final List<ClosetBuyable> l0(ClosetAvatarPartsResponse closetAvatarPartsResponse, jf.k0 k0Var) {
        Object obj;
        Iterator<T> it = closetAvatarPartsResponse.getBodies().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((ClosetAvatarBody) obj).getId(), this.f42670e0)) {
                break;
            }
        }
        ClosetAvatarBody closetAvatarBody = (ClosetAvatarBody) obj;
        switch (a.f42710a[k0Var.ordinal()]) {
            case 1:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getFacePaints();
                }
                return null;
            case 2:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getBeards();
                }
                return null;
            case 3:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getCheeks();
                }
                return null;
            case 4:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getEyeshadows();
                }
                return null;
            case 5:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getLips();
                }
                return null;
            case 6:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getPets();
                }
                return null;
            case 7:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getHats();
                }
                return null;
            case 8:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getGlasses();
                }
                return null;
            case 9:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getScarfs();
                }
                return null;
            case 10:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getWeapons();
                }
                return null;
            case 11:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getWings();
                }
                return null;
            case 12:
                return closetAvatarPartsResponse.getCompanion().getTypes();
            case 13:
                return closetAvatarPartsResponse.getCompanion().getTops();
            case 14:
                return closetAvatarPartsResponse.getCompanion().getHats();
            case 15:
                return closetAvatarPartsResponse.getCompanion().getScarfs();
            case 16:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getBackWings();
                }
                return null;
            case 17:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getEffects();
                }
                return null;
            case 18:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getLeftInteriors();
                }
                return null;
            case 19:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getCenterInteriors();
                }
                return null;
            case 20:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getRightInteriors();
                }
                return null;
            case 21:
                return closetAvatarPartsResponse.getHatsV2();
            case 22:
                return closetAvatarPartsResponse.getHairOrnaments();
            case 23:
                return closetAvatarPartsResponse.getHeadBands();
            case 24:
                return closetAvatarPartsResponse.getGlassesV2();
            case 25:
                return closetAvatarPartsResponse.getMasks();
            case 26:
                return closetAvatarPartsResponse.getEarrings();
            case 27:
                return closetAvatarPartsResponse.getLeftWeapons();
            case 28:
                return closetAvatarPartsResponse.getRightWeapons();
            case 29:
                return closetAvatarPartsResponse.getBothWeapons();
            case 30:
                return closetAvatarPartsResponse.getKemomimis();
            case 31:
                return closetAvatarPartsResponse.getNecklaces();
            case 32:
                return closetAvatarPartsResponse.getBodies();
            case 33:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getPersonas();
                }
                return null;
            case 34:
                return closetAvatarPartsResponse.getMotions();
            case 35:
                return closetAvatarPartsResponse.getMotions();
            case 36:
                return closetAvatarPartsResponse.getMotions();
            case 37:
                return closetAvatarPartsResponse.getMotions();
            case 38:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getProportions();
                }
                return null;
            case 39:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getHeads();
                }
                return null;
            case 40:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getHairs();
                }
                return null;
            case 41:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getEyebrows();
                }
                return null;
            case 42:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getEyes();
                }
                return null;
            case 43:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getNoses();
                }
                return null;
            case 44:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getMouths();
                }
                return null;
            case 45:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getSetupClothes();
                }
                return null;
            case 46:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getOnepieces();
                }
                return null;
            case 47:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getTops();
                }
                return null;
            case 48:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getBottoms();
                }
                return null;
            case 49:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getSocks();
                }
                return null;
            case 50:
                if (closetAvatarBody != null) {
                    return closetAvatarBody.getShoes();
                }
                return null;
            case 51:
                return closetAvatarPartsResponse.getBackgrounds();
            case 52:
                return closetAvatarPartsResponse.getMachines();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean l1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getEarrings() : null, lVar);
    }

    public final boolean l2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getOnepieces() : null, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x018e, code lost:
        if (jo.p.c(r3, r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01bc, code lost:
        if (jo.p.c(r3, r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
        if (jo.p.c(r3, r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        if (jo.p.c(r3, r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0154, code lost:
        if (jo.p.c(r3, r7) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ud.q> m0(jf.k0 r9) {
        /*
            Method dump skipped, instructions count: 1974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.f.m0(jf.k0):java.util.List");
    }

    public final LiveData<List<ud.p>> n0() {
        return this.f42692p0;
    }

    public final boolean n1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getEffects() : null, lVar);
    }

    public final boolean n2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getPets() : null, lVar);
    }

    public final LiveData<List<jf.l0>> o0() {
        return this.f42688n0;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.k0 k0Var) {
        jo.p.h(k0Var, "event");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.k kVar) {
        jo.p.h(kVar, "event");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.l0 l0Var) {
        jo.p.h(l0Var, "event");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.n0 n0Var) {
        jo.p.h(n0Var, "event");
        x(n0Var.a());
    }

    public final LiveData<List<jf.n0>> p0() {
        return this.f42684l0;
    }

    public final boolean p1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getEyebrows() : null, lVar);
    }

    public final boolean p2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getProportions() : null, lVar);
    }

    public final LiveData<Integer> q0() {
        return this.f42674g0;
    }

    public final LiveData<Integer> r0() {
        return this.J0;
    }

    public final boolean r1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getEyes() : null, lVar);
    }

    public final boolean r2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getRightInteriors() : null, lVar);
    }

    public final xo.g0<List<jf.d>> s0() {
        return this.f42687m1;
    }

    public final LiveData<Boolean> t0() {
        return this.F0;
    }

    public final boolean t1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getEyeshadows() : null, lVar);
    }

    public final boolean t2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarPartsResponse f10 = this.W.f();
        return O0(f10 != null ? f10.getRightWeapons() : null, lVar);
    }

    public final List<jf.l0> u0() {
        List<ClosetBuyableAccessoryAsset> rightInteriors;
        List<ClosetBuyableAccessoryAsset> centerInteriors;
        List<ClosetBuyableAccessoryAsset> leftInteriors;
        List<ClosetBuyableAccessoryAsset> effects;
        List<ClosetBuyableBackground> backgrounds;
        ArrayList arrayList = new ArrayList();
        ClosetAvatarBody C = C();
        ClosetAvatarPartsResponse f10 = this.W.f();
        boolean z10 = false;
        if ((f10 == null || (backgrounds = f10.getBackgrounds()) == null || !(backgrounds.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.BACKGROUND, nd.y0.ic_avatar_background, X0(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (effects = C.getEffects()) == null || !(effects.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.EFFECT, nd.y0.ic_avatar_effect, o1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (leftInteriors = C.getLeftInteriors()) == null || !(leftInteriors.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.LEFT_INTERIOR, nd.y0.ic_avatar_left_interior, V1(this, null, 1, null), false, 8, null));
        }
        if ((C == null || (centerInteriors = C.getCenterInteriors()) == null || !(centerInteriors.isEmpty() ^ true)) ? false : true) {
            arrayList.add(new jf.l0(jf.k0.CENTER_INTERIOR, nd.y0.ic_avatar_center_interior, e1(this, null, 1, null), false, 8, null));
        }
        if (C != null && (rightInteriors = C.getRightInteriors()) != null && (!rightInteriors.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            arrayList.add(new jf.l0(jf.k0.RIGHT_INTERIOR, nd.y0.ic_avatar_right_interior, s2(this, null, 1, null), false, 8, null));
        }
        return xn.a0.B0(arrayList);
    }

    public final boolean u2(io.l<? super ClosetBuyable, Boolean> lVar) {
        return W0(lVar) || n1(lVar) || U1(lVar) || d1(lVar) || r2(lVar);
    }

    public final LiveData<Boolean> v0() {
        return this.B0;
    }

    public final boolean v1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getFacePaints() : null, lVar);
    }

    public final LiveData<ClosetAvatar> w0() {
        return this.T;
    }

    public final boolean w2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getScarfs() : null, lVar);
    }

    public final void x(jf.k0 k0Var) {
        ClosetAvatar closetAvatar = this.V;
        if (closetAvatar == null) {
            return;
        }
        Set<? extends jf.k0> c10 = xn.t0.c(k0Var);
        switch (a.f42710a[k0Var.ordinal()]) {
            case 1:
                closetAvatar.setFacePaint(null);
                break;
            case 2:
                closetAvatar.setBeard(null);
                break;
            case 3:
                closetAvatar.setCheek(null);
                break;
            case 4:
                closetAvatar.setEyeshadow(null);
                break;
            case 5:
                closetAvatar.setLip(null);
                break;
            case 6:
                closetAvatar.setPet(null);
                break;
            case 7:
                closetAvatar.setHat(null);
                break;
            case 8:
                closetAvatar.setGlasses(null);
                break;
            case 9:
                closetAvatar.setScarf(null);
                break;
            case 10:
                closetAvatar.setWeapon(null);
                break;
            case 11:
                closetAvatar.setWing(null);
                break;
            case 12:
                closetAvatar.setCompanionType(null);
                closetAvatar.setCompanionTops(null);
                closetAvatar.setCompanionHat(null);
                closetAvatar.setCompanionScarf(null);
                c10.add(jf.k0.COMPANION_TOPS);
                c10.add(jf.k0.COMPANION_HAT);
                c10.add(jf.k0.COMPANION_SCARF);
                break;
            case 13:
                closetAvatar.setCompanionTops(null);
                break;
            case 14:
                closetAvatar.setCompanionHat(null);
                break;
            case 15:
                closetAvatar.setCompanionScarf(null);
                break;
            case 16:
                closetAvatar.setBackWing(null);
                break;
            case 17:
                closetAvatar.setEffect(null);
                break;
            case 18:
                closetAvatar.setLeftInterior(null);
                break;
            case 19:
                closetAvatar.setCenterInterior(null);
                break;
            case 20:
                closetAvatar.setRightInterior(null);
                break;
            case 21:
                closetAvatar.setHatV2(null);
                break;
            case 22:
                closetAvatar.setHairOrnament(null);
                break;
            case 23:
                closetAvatar.setHeadBand(null);
                break;
            case 24:
                closetAvatar.setGlassesV2(null);
                break;
            case 25:
                closetAvatar.setMask(null);
                break;
            case 26:
                closetAvatar.setEarring(null);
                break;
            case 27:
                closetAvatar.setLeftWeapon(null);
                break;
            case 28:
                closetAvatar.setRightWeapon(null);
                break;
            case 29:
                closetAvatar.setBothWeapon(null);
                break;
            case 30:
                closetAvatar.setKemomimi(null);
                break;
            case 31:
                closetAvatar.setNecklace(null);
                break;
        }
        UnityManager.updateAllParts$default(UnityManager.Companion.getInstance(), jf.c.f37906y.a(closetAvatar).c(c10), closetAvatar, 0, 4, null);
        z();
        R2();
    }

    public final jf.k0 x0() {
        return this.f42668d0;
    }

    public final boolean x1(io.l<? super ClosetBuyable, Boolean> lVar) {
        return p2(lVar) || N1(lVar) || F1(lVar) || p1(lVar) || r1(lVar) || t1(lVar) || f1(lVar) || j2(lVar) || f2(lVar) || X1(lVar) || Y0(lVar);
    }

    public final int y() {
        int i10 = 0;
        for (ud.q qVar : U()) {
            i10 += qVar.b();
        }
        return i10;
    }

    public final int y0() {
        return this.f42680j0;
    }

    public final boolean y2(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getSetupClothes() : null, lVar);
    }

    public final void z() {
        this.f42676h0 = true;
        U2();
    }

    public final jf.m0 z0() {
        return this.f42666c0;
    }

    public final boolean z1(io.l<? super ClosetBuyable, Boolean> lVar) {
        ClosetAvatarBody C = C();
        return O0(C != null ? C.getGlasses() : null, lVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.f0 f0Var) {
        jo.p.h(f0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.q qVar) {
        jo.p.h(qVar, "event");
        androidx.lifecycle.e0<Boolean> e0Var = this.M0;
        Boolean bool = Boolean.FALSE;
        e0Var.p(bool);
        this.F.p(bool);
        this.P.m(qVar.b().getCloset());
        this.Q.m(qVar.b().getCloset());
        Closet closet = qVar.b().getCloset();
        this.f42680j0 = closet != null ? closet.getClosetId() : 1;
        this.S.m(qVar.b().getAvatar());
        this.U = qVar.b().getAvatar().clone();
        this.V = qVar.b().getAvatar().clone();
        this.f42670e0 = qVar.b().getAvatar().getBodyId();
        this.f42676h0 = false;
        this.f42678i0 = false;
        this.f42695q1 = qVar.b().getShareText();
        this.f42662a0.p(jf.c.f37906y.a(qVar.b().getAvatar().clone()));
        this.Y.p(qVar.a().getClosets());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.C0714f c0714f) {
        jo.p.h(c0714f, "event");
        this.F.p(Boolean.FALSE);
        uo.l.d(this, null, null, new z0(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.d0 d0Var) {
        jo.p.h(d0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.n nVar) {
        jo.p.h(nVar, "event");
        this.F.p(Boolean.FALSE);
        androidx.lifecycle.e0<Closet> e0Var = this.Q;
        Closet closet = nVar.b().getCloset();
        if (closet == null) {
            closet = new Closet(nVar.a(), null, null, null, null, null, false, false, 254, null);
        }
        e0Var.p(closet);
        Closet closet2 = nVar.b().getCloset();
        this.f42680j0 = closet2 != null ? closet2.getClosetId() : nVar.a();
        Closet f10 = this.P.f();
        Integer valueOf = f10 != null ? Integer.valueOf(f10.getClosetId()) : null;
        Closet f11 = this.Q.f();
        this.f42678i0 = !jo.p.c(valueOf, f11 != null ? Integer.valueOf(f11.getClosetId()) : null);
        this.U = nVar.b().getAvatar().clone();
        this.V = nVar.b().getAvatar().clone();
        this.f42662a0.m(jf.c.f37906y.a(nVar.b().getAvatar().clone()));
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new a1(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.e0 e0Var) {
        jo.p.h(e0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.o oVar) {
        jo.p.h(oVar, "event");
        this.F.p(Boolean.FALSE);
        List<ClosetBuyableAccessoryAsset> types = oVar.a().getCompanion().getTypes();
        ArrayList arrayList = new ArrayList(xn.t.u(types, 10));
        for (ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset : types) {
            arrayList.add(jf.l.f37934c.a(closetBuyableAccessoryAsset));
        }
        this.O0 = arrayList;
        this.W.p(oVar.a());
        this.f42672f0.p(Integer.valueOf(oVar.a().getRemainingKandumes()));
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new g1(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.j0 j0Var) {
        jo.p.h(j0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.u uVar) {
        ArrayList arrayList;
        jo.p.h(uVar, "event");
        this.F.p(Boolean.FALSE);
        androidx.lifecycle.e0<List<Closet>> e0Var = this.Y;
        List<Closet> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList(xn.t.u(f10, 10));
            for (Closet closet : f10) {
                if (closet.getClosetId() == uVar.a()) {
                    closet = uVar.b().getCloset();
                }
                arrayList.add(closet);
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
        Closet f11 = this.P.f();
        boolean z10 = true;
        if (f11 != null && f11.getClosetId() == uVar.b().getCloset().getClosetId()) {
            this.P.p(uVar.b().getCloset());
        }
        Closet f12 = this.Q.f();
        if ((f12 == null || f12.getClosetId() != uVar.b().getCloset().getClosetId()) ? false : false) {
            this.Q.p(uVar.b().getCloset());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.j jVar) {
        jo.p.h(jVar, "event");
        uo.l.d(this, null, null, new h1(jVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.p pVar) {
        jo.p.h(pVar, "event");
        this.f42672f0.m(Integer.valueOf(pVar.a().getRemainingKandumes()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.g0 g0Var) {
        jo.p.h(g0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.r rVar) {
        ArrayList arrayList;
        jo.p.h(rVar, "event");
        this.F.p(Boolean.FALSE);
        this.S.p(rVar.b().getAvatar());
        this.U = rVar.b().getAvatar().clone();
        this.V = rVar.b().getAvatar().clone();
        this.f42662a0.p(jf.c.f37906y.a(rVar.b().getAvatar()));
        this.f42676h0 = false;
        Closet closet = rVar.b().getCloset();
        if (closet != null) {
            this.P.p(closet);
            this.Q.p(closet);
            this.f42680j0 = closet.getClosetId();
            this.f42678i0 = false;
            androidx.lifecycle.e0<List<Closet>> e0Var = this.Y;
            List<Closet> f10 = e0Var.f();
            if (f10 != null) {
                jo.p.g(f10, "value");
                arrayList = new ArrayList(xn.t.u(f10, 10));
                for (Closet closet2 : f10) {
                    if (closet2.getClosetId() == rVar.a()) {
                        closet2 = closet;
                    }
                    arrayList.add(closet2);
                }
            } else {
                arrayList = null;
            }
            e0Var.p(arrayList);
        }
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new i1(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.i0 i0Var) {
        jo.p.h(i0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.t tVar) {
        ArrayList arrayList;
        jo.p.h(tVar, "event");
        this.F.p(Boolean.FALSE);
        this.P.p(tVar.b().getCloset());
        this.Q.p(tVar.b().getCloset());
        this.f42680j0 = tVar.b().getCloset().getClosetId();
        this.f42678i0 = false;
        androidx.lifecycle.e0<List<Closet>> e0Var = this.Y;
        List<Closet> f10 = e0Var.f();
        if (f10 != null) {
            arrayList = new ArrayList(xn.t.u(f10, 10));
            for (Closet closet : f10) {
                if (closet.getClosetId() == tVar.a()) {
                    closet = tVar.b().getCloset();
                }
                arrayList.add(closet);
            }
        } else {
            arrayList = null;
        }
        e0Var.p(arrayList);
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.i iVar) {
        jo.p.h(iVar, "event");
        uo.l.d(this, null, null, new x0(iVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.h0 h0Var) {
        jo.p.h(h0Var, "event");
        this.F.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.s sVar) {
        ArrayList arrayList;
        jo.p.h(sVar, "event");
        this.F.p(Boolean.FALSE);
        this.S.p(sVar.a().getAvatar());
        ClosetAvatar f10 = this.S.f();
        ArrayList arrayList2 = null;
        this.U = f10 != null ? f10.clone() : null;
        ClosetAvatar f11 = this.S.f();
        this.V = f11 != null ? f11.clone() : null;
        if (!sVar.d()) {
            this.f42676h0 = false;
        }
        Closet closet = sVar.a().getCloset();
        if (closet != null) {
            this.P.m(closet);
            this.Q.m(closet);
            this.f42680j0 = closet.getClosetId();
            this.f42678i0 = false;
            androidx.lifecycle.e0<List<Closet>> e0Var = this.Y;
            List<Closet> f12 = e0Var.f();
            if (f12 != null) {
                jo.p.g(f12, "value");
                arrayList = new ArrayList(xn.t.u(f12, 10));
                for (Closet closet2 : f12) {
                    if (closet2.getClosetId() == sVar.b()) {
                        closet2 = closet;
                    }
                    arrayList.add(closet2);
                }
            } else {
                arrayList = null;
            }
            e0Var.p(arrayList);
        }
        this.P.p(sVar.c().getCloset());
        this.Q.p(sVar.c().getCloset());
        this.f42680j0 = sVar.c().getCloset().getClosetId();
        this.f42678i0 = false;
        androidx.lifecycle.e0<List<Closet>> e0Var2 = this.Y;
        List<Closet> f13 = e0Var2.f();
        if (f13 != null) {
            arrayList2 = new ArrayList(xn.t.u(f13, 10));
            for (Closet closet3 : f13) {
                if (closet3.getClosetId() == sVar.b()) {
                    closet3 = sVar.c().getCloset();
                }
                arrayList2.add(closet3);
            }
        }
        e0Var2.p(arrayList2);
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new y0(hVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.v vVar) {
        androidx.lifecycle.e0<CharSequence> f10;
        jo.p.h(vVar, "event");
        List<jf.l> list = this.O0;
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (jf.l lVar : list) {
            arrayList.add(new jf.l(lVar.b(), jo.p.c(lVar.b(), vVar.a()) ? vVar.b().getName() : lVar.a()));
        }
        this.O0 = arrayList;
        UnityManager.Companion.getInstance().setCompanionName(vVar.b().getName());
        jf.p f11 = this.P0.f();
        if (f11 == null || (f10 = f11.f()) == null) {
            return;
        }
        f10.m(vVar.b().getName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.w wVar) {
        List<ClosetBuyableAccessoryAsset> hats;
        List<ClosetBuyableAccessoryAsset> glasses;
        List<ClosetBuyableAccessoryAsset> scarfs;
        List<ClosetBuyableAccessoryAsset> weapons;
        List<ClosetBuyableAccessoryAsset> backWings;
        List<ClosetBuyableAccessoryAsset> effects;
        List<ClosetBuyableAccessoryAsset> leftInteriors;
        List<ClosetBuyableAccessoryAsset> centerInteriors;
        List<ClosetBuyableAccessoryAsset> rightInteriors;
        List<ClosetBuyableAccessoryAsset> hatsV2;
        List<ClosetBuyableAccessoryAsset> hairOrnaments;
        List<ClosetBuyableAccessoryAsset> headBands;
        List<ClosetBuyableAccessoryAsset> glassesV2;
        List<ClosetBuyableAccessoryAsset> masks;
        List<ClosetBuyableAccessoryAsset> earrings;
        List<ClosetBuyableAccessoryAsset> leftWeapons;
        List<ClosetBuyableAccessoryAsset> rightWeapons;
        List<ClosetBuyableAccessoryAsset> bothWeapons;
        List<ClosetBuyableAccessoryAsset> kemomimis;
        List<ClosetBuyableAccessoryAsset> necklaces;
        androidx.lifecycle.e0<CharSequence> f10;
        jo.p.h(wVar, "event");
        jf.p f11 = this.P0.f();
        if (f11 != null && (f10 = f11.f()) != null) {
            f10.m(wVar.b().getPartText());
            wn.v vVar = wn.v.f59242a;
        }
        int i10 = a.f42710a[this.f42668d0.ordinal()];
        switch (i10) {
            case 7:
                ClosetAvatar closetAvatar = this.V;
                ClosetAccessoryAsset hat = closetAvatar != null ? closetAvatar.getHat() : null;
                if (hat != null) {
                    hat.setPartText(wVar.b().getPartText());
                }
                ClosetAvatarBody C = C();
                if (C != null && (hats = C.getHats()) != null) {
                    Iterator<T> it = hats.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next).getId(), wVar.a()) ? next : null;
                        }
                    }
                    r1 = r1;
                }
                if (r1 != null) {
                    r1.setPartText(wVar.b().getPartText());
                }
                wn.v vVar2 = wn.v.f59242a;
                return;
            case 8:
                ClosetAvatar closetAvatar2 = this.V;
                ClosetAccessoryAsset glasses2 = closetAvatar2 != null ? closetAvatar2.getGlasses() : null;
                if (glasses2 != null) {
                    glasses2.setPartText(wVar.b().getPartText());
                }
                ClosetAvatarBody C2 = C();
                if (C2 != null && (glasses = C2.getGlasses()) != null) {
                    Iterator<T> it2 = glasses.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next2).getId(), wVar.a()) ? next2 : null;
                        }
                    }
                    r1 = r1;
                }
                if (r1 != null) {
                    r1.setPartText(wVar.b().getPartText());
                }
                wn.v vVar3 = wn.v.f59242a;
                return;
            case 9:
                ClosetAvatar closetAvatar3 = this.V;
                ClosetAccessoryAsset scarf = closetAvatar3 != null ? closetAvatar3.getScarf() : null;
                if (scarf != null) {
                    scarf.setPartText(wVar.b().getPartText());
                }
                ClosetAvatarBody C3 = C();
                if (C3 != null && (scarfs = C3.getScarfs()) != null) {
                    Iterator<T> it3 = scarfs.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next3).getId(), wVar.a()) ? next3 : null;
                        }
                    }
                    r1 = r1;
                }
                if (r1 != null) {
                    r1.setPartText(wVar.b().getPartText());
                }
                wn.v vVar4 = wn.v.f59242a;
                return;
            case 10:
                ClosetAvatar closetAvatar4 = this.V;
                ClosetAccessoryAsset weapon = closetAvatar4 != null ? closetAvatar4.getWeapon() : null;
                if (weapon != null) {
                    weapon.setPartText(wVar.b().getPartText());
                }
                ClosetAvatarBody C4 = C();
                if (C4 != null && (weapons = C4.getWeapons()) != null) {
                    Iterator<T> it4 = weapons.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next4 = it4.next();
                            r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next4).getId(), wVar.a()) ? next4 : null;
                        }
                    }
                    r1 = r1;
                }
                if (r1 != null) {
                    r1.setPartText(wVar.b().getPartText());
                }
                wn.v vVar5 = wn.v.f59242a;
                return;
            default:
                switch (i10) {
                    case 16:
                        ClosetAvatar closetAvatar5 = this.V;
                        ClosetAccessoryAsset backWing = closetAvatar5 != null ? closetAvatar5.getBackWing() : null;
                        if (backWing != null) {
                            backWing.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarBody C5 = C();
                        if (C5 != null && (backWings = C5.getBackWings()) != null) {
                            Iterator<T> it5 = backWings.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Object next5 = it5.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next5).getId(), wVar.a()) ? next5 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar6 = wn.v.f59242a;
                        return;
                    case 17:
                        ClosetAvatar closetAvatar6 = this.V;
                        ClosetAccessoryAsset effect = closetAvatar6 != null ? closetAvatar6.getEffect() : null;
                        if (effect != null) {
                            effect.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarBody C6 = C();
                        if (C6 != null && (effects = C6.getEffects()) != null) {
                            Iterator<T> it6 = effects.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    Object next6 = it6.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next6).getId(), wVar.a()) ? next6 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar7 = wn.v.f59242a;
                        return;
                    case 18:
                        ClosetAvatar closetAvatar7 = this.V;
                        ClosetAccessoryAsset leftInterior = closetAvatar7 != null ? closetAvatar7.getLeftInterior() : null;
                        if (leftInterior != null) {
                            leftInterior.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarBody C7 = C();
                        if (C7 != null && (leftInteriors = C7.getLeftInteriors()) != null) {
                            Iterator<T> it7 = leftInteriors.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    Object next7 = it7.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next7).getId(), wVar.a()) ? next7 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar8 = wn.v.f59242a;
                        return;
                    case 19:
                        ClosetAvatar closetAvatar8 = this.V;
                        ClosetAccessoryAsset centerInterior = closetAvatar8 != null ? closetAvatar8.getCenterInterior() : null;
                        if (centerInterior != null) {
                            centerInterior.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarBody C8 = C();
                        if (C8 != null && (centerInteriors = C8.getCenterInteriors()) != null) {
                            Iterator<T> it8 = centerInteriors.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    Object next8 = it8.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next8).getId(), wVar.a()) ? next8 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar9 = wn.v.f59242a;
                        return;
                    case 20:
                        ClosetAvatar closetAvatar9 = this.V;
                        ClosetAccessoryAsset rightInterior = closetAvatar9 != null ? closetAvatar9.getRightInterior() : null;
                        if (rightInterior != null) {
                            rightInterior.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarBody C9 = C();
                        if (C9 != null && (rightInteriors = C9.getRightInteriors()) != null) {
                            Iterator<T> it9 = rightInteriors.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    Object next9 = it9.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next9).getId(), wVar.a()) ? next9 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar10 = wn.v.f59242a;
                        return;
                    case 21:
                        ClosetAvatar closetAvatar10 = this.V;
                        ClosetAccessoryAsset hatV2 = closetAvatar10 != null ? closetAvatar10.getHatV2() : null;
                        if (hatV2 != null) {
                            hatV2.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f12 = this.W.f();
                        if (f12 != null && (hatsV2 = f12.getHatsV2()) != null) {
                            Iterator<T> it10 = hatsV2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    Object next10 = it10.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next10).getId(), wVar.a()) ? next10 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar11 = wn.v.f59242a;
                        return;
                    case 22:
                        ClosetAvatar closetAvatar11 = this.V;
                        ClosetAccessoryAsset hairOrnament = closetAvatar11 != null ? closetAvatar11.getHairOrnament() : null;
                        if (hairOrnament != null) {
                            hairOrnament.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f13 = this.W.f();
                        if (f13 != null && (hairOrnaments = f13.getHairOrnaments()) != null) {
                            Iterator<T> it11 = hairOrnaments.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    Object next11 = it11.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next11).getId(), wVar.a()) ? next11 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar12 = wn.v.f59242a;
                        return;
                    case 23:
                        ClosetAvatar closetAvatar12 = this.V;
                        ClosetAccessoryAsset headBand = closetAvatar12 != null ? closetAvatar12.getHeadBand() : null;
                        if (headBand != null) {
                            headBand.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f14 = this.W.f();
                        if (f14 != null && (headBands = f14.getHeadBands()) != null) {
                            Iterator<T> it12 = headBands.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    Object next12 = it12.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next12).getId(), wVar.a()) ? next12 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar13 = wn.v.f59242a;
                        return;
                    case 24:
                        ClosetAvatar closetAvatar13 = this.V;
                        ClosetAccessoryAsset glassesV22 = closetAvatar13 != null ? closetAvatar13.getGlassesV2() : null;
                        if (glassesV22 != null) {
                            glassesV22.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f15 = this.W.f();
                        if (f15 != null && (glassesV2 = f15.getGlassesV2()) != null) {
                            Iterator<T> it13 = glassesV2.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    Object next13 = it13.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next13).getId(), wVar.a()) ? next13 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar14 = wn.v.f59242a;
                        return;
                    case 25:
                        ClosetAvatar closetAvatar14 = this.V;
                        ClosetAccessoryAsset mask = closetAvatar14 != null ? closetAvatar14.getMask() : null;
                        if (mask != null) {
                            mask.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f16 = this.W.f();
                        if (f16 != null && (masks = f16.getMasks()) != null) {
                            Iterator<T> it14 = masks.iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    Object next14 = it14.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next14).getId(), wVar.a()) ? next14 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar15 = wn.v.f59242a;
                        return;
                    case 26:
                        ClosetAvatar closetAvatar15 = this.V;
                        ClosetAccessoryAsset earring = closetAvatar15 != null ? closetAvatar15.getEarring() : null;
                        if (earring != null) {
                            earring.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f17 = this.W.f();
                        if (f17 != null && (earrings = f17.getEarrings()) != null) {
                            Iterator<T> it15 = earrings.iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    Object next15 = it15.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next15).getId(), wVar.a()) ? next15 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar16 = wn.v.f59242a;
                        return;
                    case 27:
                        ClosetAvatar closetAvatar16 = this.V;
                        ClosetAccessoryAsset leftWeapon = closetAvatar16 != null ? closetAvatar16.getLeftWeapon() : null;
                        if (leftWeapon != null) {
                            leftWeapon.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f18 = this.W.f();
                        if (f18 != null && (leftWeapons = f18.getLeftWeapons()) != null) {
                            Iterator<T> it16 = leftWeapons.iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    Object next16 = it16.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next16).getId(), wVar.a()) ? next16 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar17 = wn.v.f59242a;
                        return;
                    case 28:
                        ClosetAvatar closetAvatar17 = this.V;
                        ClosetAccessoryAsset rightWeapon = closetAvatar17 != null ? closetAvatar17.getRightWeapon() : null;
                        if (rightWeapon != null) {
                            rightWeapon.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f19 = this.W.f();
                        if (f19 != null && (rightWeapons = f19.getRightWeapons()) != null) {
                            Iterator<T> it17 = rightWeapons.iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    Object next17 = it17.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next17).getId(), wVar.a()) ? next17 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar18 = wn.v.f59242a;
                        return;
                    case 29:
                        ClosetAvatar closetAvatar18 = this.V;
                        ClosetAccessoryAsset bothWeapon = closetAvatar18 != null ? closetAvatar18.getBothWeapon() : null;
                        if (bothWeapon != null) {
                            bothWeapon.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f20 = this.W.f();
                        if (f20 != null && (bothWeapons = f20.getBothWeapons()) != null) {
                            Iterator<T> it18 = bothWeapons.iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    Object next18 = it18.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next18).getId(), wVar.a()) ? next18 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar19 = wn.v.f59242a;
                        return;
                    case 30:
                        ClosetAvatar closetAvatar19 = this.V;
                        ClosetAccessoryAsset kemomimi = closetAvatar19 != null ? closetAvatar19.getKemomimi() : null;
                        if (kemomimi != null) {
                            kemomimi.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f21 = this.W.f();
                        if (f21 != null && (kemomimis = f21.getKemomimis()) != null) {
                            Iterator<T> it19 = kemomimis.iterator();
                            while (true) {
                                if (it19.hasNext()) {
                                    Object next19 = it19.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next19).getId(), wVar.a()) ? next19 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                        }
                        wn.v vVar20 = wn.v.f59242a;
                        return;
                    case 31:
                        ClosetAvatar closetAvatar20 = this.V;
                        ClosetAccessoryAsset necklace = closetAvatar20 != null ? closetAvatar20.getNecklace() : null;
                        if (necklace != null) {
                            necklace.setPartText(wVar.b().getPartText());
                        }
                        ClosetAvatarPartsResponse f22 = this.W.f();
                        if (f22 != null && (necklaces = f22.getNecklaces()) != null) {
                            Iterator<T> it20 = necklaces.iterator();
                            while (true) {
                                if (it20.hasNext()) {
                                    Object next20 = it20.next();
                                    r1 = jo.p.c(((ClosetBuyableAccessoryAsset) next20).getId(), wVar.a()) ? next20 : null;
                                }
                            }
                            r1 = r1;
                        }
                        if (r1 != null) {
                            r1.setPartText(wVar.b().getPartText());
                            break;
                        }
                        break;
                }
                wn.v vVar21 = wn.v.f59242a;
                return;
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.m0 m0Var) {
        jo.p.h(m0Var, "event");
        uo.l.d(this, null, null, new b1(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new c1(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.l lVar) {
        jo.p.h(lVar, "event");
        R2();
        uo.l.d(this, null, null, new d1(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new e1(null), 3, null);
        this.U = this.S.f();
        this.Q.m(this.P.f());
        Closet f10 = this.P.f();
        this.f42680j0 = f10 != null ? f10.getClosetId() : 1;
        this.f42676h0 = false;
        this.f42678i0 = false;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.a0 a0Var) {
        jo.p.h(a0Var, "event");
        androidx.lifecycle.e0<ClosetAvatar> e0Var = this.S;
        ClosetAvatar closetAvatar = this.V;
        e0Var.p(closetAvatar != null ? closetAvatar.clone() : null);
        this.f42680j0 = 1;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.b0 b0Var) {
        jo.p.h(b0Var, "event");
        this.f42662a0.p(b0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.t0 t0Var) {
        jf.k0 k0Var;
        jo.p.h(t0Var, "event");
        jf.m0 a10 = t0Var.a();
        this.f42666c0 = a10;
        switch (a.f42711b[a10.ordinal()]) {
            case 1:
                k0Var = jf.k0.GENDER;
                break;
            case 2:
                k0Var = jf.k0.PERSONA;
                break;
            case 3:
                jf.l0 l0Var = (jf.l0) xn.a0.Z(V());
                if (l0Var == null || (k0Var = l0Var.c()) == null) {
                    k0Var = jf.k0.GENDER;
                    break;
                }
                break;
            case 4:
                jf.l0 l0Var2 = (jf.l0) xn.a0.Z(M());
                if (l0Var2 == null || (k0Var = l0Var2.c()) == null) {
                    k0Var = jf.k0.GENDER;
                    break;
                }
                break;
            case 5:
                jf.l0 l0Var3 = (jf.l0) xn.a0.Z(A());
                if (l0Var3 == null || (k0Var = l0Var3.c()) == null) {
                    k0Var = jf.k0.GENDER;
                    break;
                }
                break;
            case 6:
                jf.k0[] values = jf.k0.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        jf.k0 k0Var2 = values[i10];
                        if (k0Var2.e() == jf.m0.COMPANION) {
                            k0Var = k0Var2;
                        } else {
                            i10++;
                        }
                    } else {
                        k0Var = null;
                    }
                }
                if (k0Var == null) {
                    k0Var = jf.k0.GENDER;
                    break;
                }
                break;
            case 7:
                jf.l0 l0Var4 = (jf.l0) xn.a0.Z(u0());
                if (l0Var4 == null || (k0Var = l0Var4.c()) == null) {
                    k0Var = jf.k0.GENDER;
                    break;
                }
                break;
            case 8:
                k0Var = jf.k0.MACHINE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f42668d0 = k0Var;
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.s0 s0Var) {
        jo.p.h(s0Var, "event");
        this.f42668d0 = s0Var.a();
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.c0 c0Var) {
        jo.p.h(c0Var, "event");
        this.V = c0Var.a();
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.z zVar) {
        jo.p.h(zVar, "event");
        this.V = zVar.a();
        this.f42662a0.m(jf.c.f37906y.a(zVar.a()));
        ClosetAvatar f10 = this.S.f();
        int hashCode = f10 != null ? f10.hashCode() : 0;
        ClosetAvatar closetAvatar = this.U;
        if (hashCode == (closetAvatar != null ? closetAvatar.hashCode() : 0)) {
            this.f42676h0 = false;
            this.E0.p(Boolean.FALSE);
        }
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.o0 o0Var) {
        jo.p.h(o0Var, "event");
        this.K0.p(Boolean.valueOf(o0Var.a()));
        if (o0Var.a()) {
            return;
        }
        androidx.lifecycle.e0<List<Closet>> e0Var = this.Y;
        e0Var.p(e0Var.f());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.w0 w0Var) {
        jo.p.h(w0Var, "event");
        this.f42680j0 = w0Var.a();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.u0 u0Var) {
        jo.p.h(u0Var, "event");
        ClosetAvatar closetAvatar = this.V;
        if (closetAvatar == null) {
            return;
        }
        closetAvatar.setPose(u0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.a aVar) {
        jo.p.h(aVar, "event");
        this.M0.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.q0 q0Var) {
        jo.p.h(q0Var, "event");
        ClosetAvatar closetAvatar = this.V;
        if (closetAvatar == null) {
            return;
        }
        Set<? extends jf.k0> c10 = xn.t0.c(q0Var.a());
        int i10 = a.f42710a[q0Var.a().ordinal()];
        if (i10 == 2) {
            ClosetAvatarGradientColor beardColor = closetAvatar.getBeardColor();
            if (beardColor != null) {
                beardColor.setPercentage(q0Var.b());
            }
        } else if (i10 == 3) {
            ClosetAvatarGradientColor cheekColor = closetAvatar.getCheekColor();
            if (cheekColor != null) {
                cheekColor.setPercentage(q0Var.b());
            }
        } else if (i10 == 4) {
            ClosetAvatarGradientColor eyeshadowColor = closetAvatar.getEyeshadowColor();
            if (eyeshadowColor != null) {
                eyeshadowColor.setPercentage(q0Var.b());
            }
        } else if (i10 != 5) {
            switch (i10) {
                case 40:
                    ClosetAvatarGradientColor hairColor = closetAvatar.getHairColor();
                    if (hairColor != null) {
                        hairColor.setPercentage(q0Var.b());
                        break;
                    }
                    break;
                case 41:
                    ClosetAvatarGradientColor eyebrowColor = closetAvatar.getEyebrowColor();
                    if (eyebrowColor != null) {
                        eyebrowColor.setPercentage(q0Var.b());
                        break;
                    }
                    break;
                case 42:
                    ClosetAvatarGradientColor eyeColor = closetAvatar.getEyeColor();
                    if (eyeColor != null) {
                        eyeColor.setPercentage(q0Var.b());
                        break;
                    }
                    break;
            }
        } else {
            ClosetAvatarGradientColor lipColor = closetAvatar.getLipColor();
            if (lipColor != null) {
                lipColor.setPercentage(q0Var.b());
            }
        }
        UnityManager.updateAllParts$default(UnityManager.Companion.getInstance(), jf.c.f37906y.a(closetAvatar).c(c10), closetAvatar, 0, 4, null);
        z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.p0 p0Var) {
        List<ClosetAvatarGradientColor> beardColors;
        ?? r72;
        List<ClosetAvatarGradientColor> cheekColors;
        ?? r73;
        List<ClosetAvatarGradientColor> eyeshadowColors;
        ?? r74;
        List<ClosetAvatarGradientColor> lipColors;
        ?? r75;
        List<ClosetAvatarSimpleColor> skinColors;
        ?? r76;
        List<ClosetAvatarGradientColor> hairColors;
        ClosetAvatarGradientColor closetAvatarGradientColor;
        ?? r77;
        List<ClosetAvatarGradientColor> eyebrowColors;
        ClosetAvatarGradientColor closetAvatarGradientColor2;
        ?? r78;
        List<ClosetAvatarGradientColor> eyeColors;
        ClosetAvatarGradientColor closetAvatarGradientColor3;
        ?? r79;
        jo.p.h(p0Var, "event");
        ClosetAvatar closetAvatar = this.V;
        if (closetAvatar == null) {
            return;
        }
        Set<? extends jf.k0> c10 = xn.t0.c(this.f42668d0);
        int i10 = a.f42710a[this.f42668d0.ordinal()];
        ClosetAvatarGradientColor closetAvatarGradientColor4 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor5 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor6 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor7 = null;
        ClosetAvatarSimpleColor closetAvatarSimpleColor = null;
        r6 = null;
        ClosetAvatarSimpleColor closetAvatarSimpleColor2 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor8 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor9 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor10 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor11 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor12 = null;
        r6 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor13 = null;
        ClosetAvatarGradientColor closetAvatarGradientColor14 = null;
        closetAvatarGradientColor4 = null;
        if (i10 == 2) {
            ClosetAvatarPartsResponse f10 = this.W.f();
            if (f10 != null && (beardColors = f10.getBeardColors()) != null) {
                Iterator it = beardColors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ?? next = it.next();
                    if (((ClosetAvatarGradientColor) next).getId() == p0Var.a()) {
                        r72 = true;
                        continue;
                    } else {
                        r72 = false;
                        continue;
                    }
                    if (r72 != false) {
                        closetAvatarGradientColor14 = next;
                        break;
                    }
                }
                closetAvatarGradientColor4 = closetAvatarGradientColor14;
            }
            closetAvatar.setBeardColor(closetAvatarGradientColor4);
        } else if (i10 == 3) {
            ClosetAvatarPartsResponse f11 = this.W.f();
            if (f11 != null && (cheekColors = f11.getCheekColors()) != null) {
                Iterator it2 = cheekColors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next2 = it2.next();
                    if (((ClosetAvatarGradientColor) next2).getId() == p0Var.a()) {
                        r73 = true;
                        continue;
                    } else {
                        r73 = false;
                        continue;
                    }
                    if (r73 != false) {
                        closetAvatarGradientColor12 = next2;
                        break;
                    }
                }
                closetAvatarGradientColor13 = closetAvatarGradientColor12;
            }
            closetAvatar.setCheekColor(closetAvatarGradientColor13);
        } else if (i10 == 4) {
            ClosetAvatarPartsResponse f12 = this.W.f();
            if (f12 != null && (eyeshadowColors = f12.getEyeshadowColors()) != null) {
                Iterator it3 = eyeshadowColors.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next3 = it3.next();
                    if (((ClosetAvatarGradientColor) next3).getId() == p0Var.a()) {
                        r74 = true;
                        continue;
                    } else {
                        r74 = false;
                        continue;
                    }
                    if (r74 != false) {
                        closetAvatarGradientColor10 = next3;
                        break;
                    }
                }
                closetAvatarGradientColor11 = closetAvatarGradientColor10;
            }
            closetAvatar.setEyeshadowColor(closetAvatarGradientColor11);
        } else if (i10 == 5) {
            ClosetAvatarPartsResponse f13 = this.W.f();
            if (f13 != null && (lipColors = f13.getLipColors()) != null) {
                Iterator it4 = lipColors.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    ?? next4 = it4.next();
                    if (((ClosetAvatarGradientColor) next4).getId() == p0Var.a()) {
                        r75 = true;
                        continue;
                    } else {
                        r75 = false;
                        continue;
                    }
                    if (r75 != false) {
                        closetAvatarGradientColor8 = next4;
                        break;
                    }
                }
                closetAvatarGradientColor9 = closetAvatarGradientColor8;
            }
            closetAvatar.setLipColor(closetAvatarGradientColor9);
        } else if (i10 != 38) {
            switch (i10) {
                case 40:
                    ClosetAvatarPartsResponse f14 = this.W.f();
                    if (f14 != null && (hairColors = f14.getHairColors()) != null) {
                        Iterator it5 = hairColors.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                ?? next5 = it5.next();
                                if (((ClosetAvatarGradientColor) next5).getId() == p0Var.a()) {
                                    r77 = true;
                                    continue;
                                } else {
                                    r77 = false;
                                    continue;
                                }
                                closetAvatarGradientColor = r77 == true ? next5 : null;
                            }
                        }
                        closetAvatarGradientColor7 = closetAvatarGradientColor;
                    }
                    closetAvatar.setHairColor(closetAvatarGradientColor7);
                    break;
                case 41:
                    ClosetAvatarPartsResponse f15 = this.W.f();
                    if (f15 != null && (eyebrowColors = f15.getEyebrowColors()) != null) {
                        Iterator it6 = eyebrowColors.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                ?? next6 = it6.next();
                                if (((ClosetAvatarGradientColor) next6).getId() == p0Var.a()) {
                                    r78 = true;
                                    continue;
                                } else {
                                    r78 = false;
                                    continue;
                                }
                                closetAvatarGradientColor2 = r78 == true ? next6 : null;
                            }
                        }
                        closetAvatarGradientColor6 = closetAvatarGradientColor2;
                    }
                    closetAvatar.setEyebrowColor(closetAvatarGradientColor6);
                    break;
                case 42:
                    ClosetAvatarPartsResponse f16 = this.W.f();
                    if (f16 != null && (eyeColors = f16.getEyeColors()) != null) {
                        Iterator it7 = eyeColors.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                ?? next7 = it7.next();
                                if (((ClosetAvatarGradientColor) next7).getId() == p0Var.a()) {
                                    r79 = true;
                                    continue;
                                } else {
                                    r79 = false;
                                    continue;
                                }
                                closetAvatarGradientColor3 = r79 == true ? next7 : null;
                            }
                        }
                        closetAvatarGradientColor5 = closetAvatarGradientColor3;
                    }
                    closetAvatar.setEyeColor(closetAvatarGradientColor5);
                    break;
                default:
                    return;
            }
        } else {
            ClosetAvatarPartsResponse f17 = this.W.f();
            if (f17 != null && (skinColors = f17.getSkinColors()) != null) {
                Iterator it8 = skinColors.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    ?? next8 = it8.next();
                    if (((ClosetAvatarSimpleColor) next8).getId() == p0Var.a()) {
                        r76 = true;
                        continue;
                    } else {
                        r76 = false;
                        continue;
                    }
                    if (r76 != false) {
                        closetAvatarSimpleColor = next8;
                        break;
                    }
                }
                closetAvatarSimpleColor2 = closetAvatarSimpleColor;
            }
            closetAvatar.setSkinColor(closetAvatarSimpleColor2);
        }
        UnityManager.updateAllParts$default(UnityManager.Companion.getInstance(), jf.c.f37906y.a(closetAvatar).c(c10), closetAvatar, 0, 4, null);
        z();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.r0 r0Var) {
        jo.p.h(r0Var, "event");
        W2(r0Var.b(), r0Var.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.v0 v0Var) {
        jo.p.h(v0Var, "event");
        this.f42672f0.m(Integer.valueOf(v0Var.a().getRemainingKandumes()));
        ClosetAvatarPartsResponse f10 = this.W.f();
        if (f10 != null) {
            for (AvatarPart avatarPart : v0Var.a().getAvatarParts()) {
                for (ClosetAvatarBody closetAvatarBody : f10.getBodies()) {
                    int partType = avatarPart.getPartType();
                    if (partType == 1) {
                        V2(avatarPart, closetAvatarBody.getHeads());
                    } else if (partType == 3) {
                        V2(avatarPart, closetAvatarBody.getHairs());
                    } else if (partType == 6) {
                        V2(avatarPart, closetAvatarBody.getMouths());
                    } else if (partType == 8) {
                        V2(avatarPart, closetAvatarBody.getSetupClothes());
                    } else if (partType == 26) {
                        V2(avatarPart, closetAvatarBody.getWeapons());
                    } else if (partType == 51) {
                        V2(avatarPart, closetAvatarBody.getEyes());
                    } else if (partType == 54) {
                        V2(avatarPart, f10.getMotions());
                    } else if (partType != 59) {
                        switch (partType) {
                            case 11:
                                V2(avatarPart, f10.getBackgrounds());
                                break;
                            case 12:
                                V2(avatarPart, closetAvatarBody.getHats());
                                break;
                            case 13:
                                V2(avatarPart, closetAvatarBody.getGlasses());
                                break;
                            case 14:
                                V2(avatarPart, closetAvatarBody.getScarfs());
                                break;
                            case 15:
                                V2(avatarPart, closetAvatarBody.getNoses());
                                break;
                            case 16:
                                V2(avatarPart, closetAvatarBody.getFacePaints());
                                break;
                            case 17:
                                V2(avatarPart, closetAvatarBody.getEyebrows());
                                break;
                            case 18:
                                V2(avatarPart, closetAvatarBody.getPets());
                                break;
                            default:
                                switch (partType) {
                                    case 20:
                                        V2(avatarPart, closetAvatarBody.getTops());
                                        break;
                                    case 21:
                                        V2(avatarPart, closetAvatarBody.getBottoms());
                                        break;
                                    case 22:
                                        V2(avatarPart, closetAvatarBody.getSocks());
                                        break;
                                    case 23:
                                        V2(avatarPart, closetAvatarBody.getShoes());
                                        break;
                                    default:
                                        switch (partType) {
                                            case 32:
                                                V2(avatarPart, closetAvatarBody.getBeards());
                                                break;
                                            case 33:
                                                V2(avatarPart, closetAvatarBody.getCheeks());
                                                break;
                                            case 34:
                                                V2(avatarPart, closetAvatarBody.getEyeshadows());
                                                break;
                                            case 35:
                                                V2(avatarPart, closetAvatarBody.getLips());
                                                break;
                                            default:
                                                switch (partType) {
                                                    case 66:
                                                        V2(avatarPart, f10.getCompanion().getTypes());
                                                        break;
                                                    case 67:
                                                        V2(avatarPart, f10.getCompanion().getTops());
                                                        break;
                                                    case 68:
                                                        V2(avatarPart, f10.getCompanion().getHats());
                                                        break;
                                                    case 69:
                                                        V2(avatarPart, f10.getCompanion().getScarfs());
                                                        break;
                                                    default:
                                                        switch (partType) {
                                                            case 71:
                                                                V2(avatarPart, closetAvatarBody.getBackWings());
                                                                break;
                                                            case 72:
                                                                V2(avatarPart, closetAvatarBody.getEffects());
                                                                break;
                                                            case 73:
                                                                V2(avatarPart, closetAvatarBody.getLeftInteriors());
                                                                break;
                                                            case 74:
                                                                V2(avatarPart, closetAvatarBody.getCenterInteriors());
                                                                break;
                                                            case 75:
                                                                V2(avatarPart, closetAvatarBody.getRightInteriors());
                                                                break;
                                                            default:
                                                                switch (partType) {
                                                                    case 81:
                                                                        V2(avatarPart, f10.getHatsV2());
                                                                        break;
                                                                    case 82:
                                                                        V2(avatarPart, f10.getHairOrnaments());
                                                                        break;
                                                                    case 83:
                                                                        V2(avatarPart, f10.getHeadBands());
                                                                        break;
                                                                    case 84:
                                                                        V2(avatarPart, f10.getGlassesV2());
                                                                        break;
                                                                    case 85:
                                                                        V2(avatarPart, f10.getMasks());
                                                                        break;
                                                                    case 86:
                                                                        V2(avatarPart, f10.getEarrings());
                                                                        break;
                                                                    case 87:
                                                                        V2(avatarPart, f10.getLeftWeapons());
                                                                        break;
                                                                    case 88:
                                                                        V2(avatarPart, f10.getRightWeapons());
                                                                        break;
                                                                    case 89:
                                                                        V2(avatarPart, f10.getBothWeapons());
                                                                        break;
                                                                    case 90:
                                                                        V2(avatarPart, f10.getKemomimis());
                                                                        break;
                                                                    case 91:
                                                                        V2(avatarPart, f10.getNecklaces());
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        V2(avatarPart, closetAvatarBody.getWings());
                    }
                }
            }
        }
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new f1(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.x0 x0Var) {
        jo.p.h(x0Var, "event");
        this.f42667c1.p(x0Var.a());
        R2();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.y yVar) {
        jo.p.h(yVar, "event");
        xo.s<List<jf.d>> sVar = this.f42685l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : sVar.getValue()) {
            if (!jo.p.c(((jf.d) obj).a(), yVar.a())) {
                arrayList.add(obj);
            }
        }
        sVar.setValue(arrayList);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.x xVar) {
        jo.p.h(xVar, "event");
        xo.s<List<jf.d>> sVar = this.f42685l1;
        sVar.setValue(xn.a0.P(xn.a0.p0(sVar.getValue(), new jf.d(xVar.b(), xVar.a(), xVar.c()))));
    }
}
