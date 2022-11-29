package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.l;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward;
import com.dena.mirrorman.unity.MiniGameInput;
import com.dena.mirrorman.unity.MiniGameParam;
import com.dena.mirrorman.unity.UnityActionEvent;
import com.dena.mirrorman.unity.UnityCommand;
import com.unity3d.player.UnityPlayer;
import io.p;
import java.util.ArrayList;
import java.util.Collection;
import jf.k0;
import jo.h;
import kotlin.KotlinNothingValueException;
import oq.a;
import ue.b;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.f;
import wn.g;
import wn.m;
import wn.v;
import xn.s;
import xo.w;

/* loaded from: classes3.dex */
public final class UnityManager implements a, q0 {
    private final /* synthetic */ q0 $$delegate_0;
    private d2 addClosetDollyJob;
    private final CollabAvatarManager collabAvatarManager;
    private ClosetFocusType currentFocusType;
    private float currentScale;
    private int currentSlot;
    private final f dispatcher$delegate;
    private InitializeState initializeState;
    private boolean isGroupShot;
    private boolean isInitializedEmokara;
    private ArrayList<LoadAvatarState> loadAvatarStates;
    private final f unityCommandDispatcher$delegate;
    private final f unityStore$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final f<UnityManager> instance$delegate = g.a(UnityManager$Companion$instance$2.INSTANCE);

    @co.f(c = "com.dena.mirrorman.unity.UnityManager$1", f = "UnityManager.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: com.dena.mirrorman.unity.UnityManager$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends l implements p<q0, d<? super v>, Object> {
        public int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((AnonymousClass1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = c.c();
            int i10 = this.label;
            if (i10 == 0) {
                m.b(obj);
                w<v> initAssetBundleCompletedFlow = UnityManager.this.getUnityStore().getInitAssetBundleCompletedFlow();
                final UnityManager unityManager = UnityManager.this;
                xo.d<v> dVar = new xo.d<v>() { // from class: com.dena.mirrorman.unity.UnityManager.1.1
                    @Override // xo.d
                    public /* bridge */ /* synthetic */ Object emit(v vVar, d dVar2) {
                        return emit2(vVar, (d<? super v>) dVar2);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(v vVar, d<? super v> dVar2) {
                        UnityManager.this.setInitializeState(InitializeState.INITIALIZED);
                        return v.f59242a;
                    }
                };
                this.label = 1;
                if (initAssetBundleCompletedFlow.a(dVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.unity.UnityManager$2", f = "UnityManager.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.dena.mirrorman.unity.UnityManager$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements p<q0, d<? super v>, Object> {
        public int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((AnonymousClass2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = c.c();
            int i10 = this.label;
            if (i10 == 0) {
                m.b(obj);
                w<v> initAssetBundleFailedFlow = UnityManager.this.getUnityStore().getInitAssetBundleFailedFlow();
                final UnityManager unityManager = UnityManager.this;
                xo.d<v> dVar = new xo.d<v>() { // from class: com.dena.mirrorman.unity.UnityManager.2.1
                    @Override // xo.d
                    public /* bridge */ /* synthetic */ Object emit(v vVar, d dVar2) {
                        return emit2(vVar, (d<? super v>) dVar2);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(v vVar, d<? super v> dVar2) {
                        UnityManager.this.setInitializeState(InitializeState.DEFAULT);
                        return v.f59242a;
                    }
                };
                this.label = 1;
                if (initAssetBundleFailedFlow.a(dVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.unity.UnityManager$3", f = "UnityManager.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: com.dena.mirrorman.unity.UnityManager$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends l implements p<q0, d<? super v>, Object> {
        public int label;

        public AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((AnonymousClass3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = c.c();
            int i10 = this.label;
            if (i10 == 0) {
                m.b(obj);
                w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = UnityManager.this.getUnityStore().getLoadAvatarModelCompletedFlow();
                final UnityManager unityManager = UnityManager.this;
                xo.d<UnityLoadAvatarModel> dVar = new xo.d<UnityLoadAvatarModel>() { // from class: com.dena.mirrorman.unity.UnityManager.3.1
                    @Override // xo.d
                    public /* bridge */ /* synthetic */ Object emit(UnityLoadAvatarModel unityLoadAvatarModel, d dVar2) {
                        return emit2(unityLoadAvatarModel, (d<? super v>) dVar2);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(UnityLoadAvatarModel unityLoadAvatarModel, d<? super v> dVar2) {
                        if (unityLoadAvatarModel.getSlot() < UnityManager.this.loadAvatarStates.size()) {
                            UnityManager.this.loadAvatarStates.set(unityLoadAvatarModel.getSlot(), LoadAvatarState.LOADED);
                        }
                        return v.f59242a;
                    }
                };
                this.label = 1;
                if (loadAvatarModelCompletedFlow.a(dVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UnityManager getInstance() {
            return (UnityManager) UnityManager.instance$delegate.getValue();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k0.values().length];
            iArr[k0.WEAPON.ordinal()] = 1;
            iArr[k0.LEFT_WEAPON.ordinal()] = 2;
            iArr[k0.RIGHT_WEAPON.ordinal()] = 3;
            iArr[k0.BOTH_WEAPON.ordinal()] = 4;
            iArr[k0.RIGHT_INTERIOR.ordinal()] = 5;
            iArr[k0.LEFT_INTERIOR.ordinal()] = 6;
            iArr[k0.CENTER_INTERIOR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private UnityManager() {
        this.$$delegate_0 = r0.b();
        this.initializeState = InitializeState.DEFAULT;
        LoadAvatarState loadAvatarState = LoadAvatarState.DEFAULT;
        this.loadAvatarStates = s.e(loadAvatarState, loadAvatarState, loadAvatarState, loadAvatarState);
        cr.a aVar = cr.a.f28611a;
        this.unityStore$delegate = g.b(aVar.b(), new UnityManager$special$$inlined$inject$default$1(this, null, null));
        this.unityCommandDispatcher$delegate = g.b(aVar.b(), new UnityManager$special$$inlined$inject$default$2(this, null, null));
        this.dispatcher$delegate = g.b(aVar.b(), new UnityManager$special$$inlined$inject$default$3(this, null, null));
        this.currentScale = CameraDolly.DEFAULT.getRawValue();
        this.currentFocusType = ClosetFocusType.MAIN;
        this.collabAvatarManager = new CollabAvatarManager();
        uo.l.d(this, null, null, new AnonymousClass1(null), 3, null);
        uo.l.d(this, null, null, new AnonymousClass2(null), 3, null);
        uo.l.d(this, null, null, new AnonymousClass3(null), 3, null);
    }

    public /* synthetic */ UnityManager(h hVar) {
        this();
    }

    public static /* synthetic */ void closetFocus$default(UnityManager unityManager, ClosetFocusType closetFocusType, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        unityManager.closetFocus(closetFocusType, z10);
    }

    private final q8.a getDispatcher() {
        return (q8.a) this.dispatcher$delegate.getValue();
    }

    private final UnityCommandDispatcher getUnityCommandDispatcher() {
        return (UnityCommandDispatcher) this.unityCommandDispatcher$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnityStore getUnityStore() {
        return (UnityStore) this.unityStore$delegate.getValue();
    }

    public static /* synthetic */ void setAnimation$default(UnityManager unityManager, UnityAnimation unityAnimation, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        unityManager.setAnimation(unityAnimation, i10);
    }

    public static /* synthetic */ void setAnimationTrigger$default(UnityManager unityManager, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        unityManager.setAnimationTrigger(str, i10);
    }

    public static /* synthetic */ void setCameraDolly$default(UnityManager unityManager, CameraDolly cameraDolly, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cameraDolly = CameraDolly.DEFAULT;
        }
        unityManager.setCameraDolly(cameraDolly);
    }

    private final void setPartsComment(ClosetAvatar closetAvatar) {
        String partText;
        String partText2;
        String partText3;
        String partText4;
        String partText5;
        String partText6;
        String partText7;
        ClosetAccessoryAsset weapon = closetAvatar.getWeapon();
        if (weapon != null && (partText7 = weapon.getPartText()) != null) {
            setPartsComment(k0.WEAPON, partText7);
        }
        ClosetAccessoryAsset leftWeapon = closetAvatar.getLeftWeapon();
        if (leftWeapon != null && (partText6 = leftWeapon.getPartText()) != null) {
            setPartsComment(k0.LEFT_WEAPON, partText6);
        }
        ClosetAccessoryAsset rightWeapon = closetAvatar.getRightWeapon();
        if (rightWeapon != null && (partText5 = rightWeapon.getPartText()) != null) {
            setPartsComment(k0.RIGHT_WEAPON, partText5);
        }
        ClosetAccessoryAsset bothWeapon = closetAvatar.getBothWeapon();
        if (bothWeapon != null && (partText4 = bothWeapon.getPartText()) != null) {
            setPartsComment(k0.BOTH_WEAPON, partText4);
        }
        ClosetAccessoryAsset rightInterior = closetAvatar.getRightInterior();
        if (rightInterior != null && (partText3 = rightInterior.getPartText()) != null) {
            setPartsComment(k0.RIGHT_INTERIOR, partText3);
        }
        ClosetAccessoryAsset leftInterior = closetAvatar.getLeftInterior();
        if (leftInterior != null && (partText2 = leftInterior.getPartText()) != null) {
            setPartsComment(k0.LEFT_INTERIOR, partText2);
        }
        ClosetAccessoryAsset centerInterior = closetAvatar.getCenterInterior();
        if (centerInterior == null || (partText = centerInterior.getPartText()) == null) {
            return;
        }
        setPartsComment(k0.CENTER_INTERIOR, partText);
    }

    public static /* synthetic */ void updateAllParts$default(UnityManager unityManager, String str, ClosetAvatar closetAvatar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        unityManager.updateAllParts(str, closetAvatar, i10);
    }

    public final void addClosetDolly(float f10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.AddClosetDolly(f10, null, 2, null));
    }

    public final void addClosetRotation(float f10, float f11) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.AddClosetRotation(f10, f11, null, 4, null));
    }

    public final boolean clearAssetBundleCache() {
        if (this.initializeState == InitializeState.DEFAULT) {
            getUnityCommandDispatcher().dispatch(new UnityCommand.ClearAssetBundleCache(null, 1, null));
            return true;
        }
        return false;
    }

    public final void closetFocus(ClosetFocusType closetFocusType, boolean z10) {
        d2 d10;
        jo.p.h(closetFocusType, "closetFocusType");
        if (this.currentFocusType != closetFocusType || z10) {
            this.currentFocusType = closetFocusType;
            UnityCommandDispatcher unityCommandDispatcher = getUnityCommandDispatcher();
            ClosetFocusType closetFocusType2 = this.currentFocusType;
            ClosetFocusType closetFocusType3 = ClosetFocusType.MAIN_ZOOMOUT;
            if (closetFocusType2 == closetFocusType3) {
                closetFocusType2 = ClosetFocusType.MAIN;
            }
            unityCommandDispatcher.dispatch(new UnityCommand.SetClosetFocus(closetFocusType2, null, 2, null));
            ClosetFocusType closetFocusType4 = this.currentFocusType;
            if (closetFocusType4 == closetFocusType3 || closetFocusType4 == ClosetFocusType.BONE_SCALE) {
                d2 d2Var = this.addClosetDollyJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                d10 = uo.l.d(this, null, null, new UnityManager$closetFocus$1(this, null), 3, null);
                this.addClosetDollyJob = d10;
            }
        }
    }

    public final void disableAlpha() {
        getUnityCommandDispatcher().dispatch(new UnityCommand.DisableAlpha(null, 1, null));
    }

    public final CollabAvatarManager getCollabAvatarManager() {
        return this.collabAvatarManager;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final InitializeState getInitializeState() {
        return this.initializeState;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void initAssetBundleIfNeeded(String str) {
        jo.p.h(str, "avatarAssetBundleUrl");
        if (this.initializeState == InitializeState.DEFAULT) {
            this.initializeState = InitializeState.INITIALIZING;
            getUnityCommandDispatcher().dispatch(new UnityCommand.InitAssetBundle(str, null, 2, null));
        }
    }

    public final void initCloset(boolean z10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.InitCloset(z10, null, 2, null));
        closetFocus(this.currentFocusType, true);
    }

    public final void initEmokara(boolean z10, float f10) {
        setAvatarSlot(0);
        this.isInitializedEmokara = z10;
        getUnityCommandDispatcher().dispatch(new UnityCommand.InitEmoKara(z10, f10, null, 4, null));
    }

    public final void initGifting(boolean z10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.InitGifting(z10, null, 2, null));
    }

    public final void initMiniGame(EmomoGameName emomoGameName) {
        jo.p.h(emomoGameName, "miniGameName");
        getUnityCommandDispatcher().dispatch(new UnityCommand.InitMiniGame(emomoGameName, null, 2, null));
    }

    public final boolean isGroupShot() {
        return this.isGroupShot;
    }

    public final boolean isLoadingAvatar() {
        boolean z10;
        ArrayList<LoadAvatarState> arrayList = this.loadAvatarStates;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (LoadAvatarState loadAvatarState : arrayList) {
                if (loadAvatarState == LoadAvatarState.LOADING) {
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

    public final void loadAvatarModel(jf.c cVar, int i10) {
        jo.p.h(cVar, "closetAvatarModel");
        if (this.initializeState == InitializeState.DEFAULT) {
            return;
        }
        getUnityCommandDispatcher().dispatch(new UnityCommand.LoadAvatarSlot(i10, null, 2, null));
        this.loadAvatarStates.set(i10, LoadAvatarState.LOADING);
        setAvatarSlot(i10);
        getUnityCommandDispatcher().dispatch(new UnityCommand.LoadAvatarModel("avatar_f_model,Avatar.prefab;" + cVar.b(), i10, null, 4, null));
        if (i10 == 0) {
            setPartsComment(cVar.f());
        }
    }

    public final void loadMiniGame(jf.c cVar) {
        jo.p.h(cVar, "closetAvatarModel");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetMiniGameAvatarModel(cVar, null, 2, null));
        getUnityCommandDispatcher().dispatch(new UnityCommand.LoadMiniGame(null, 1, null));
    }

    public final void miniGameInput(MiniGameInput miniGameInput) {
        jo.p.h(miniGameInput, "miniGameInput");
        getUnityCommandDispatcher().dispatch(new UnityCommand.MiniGameInput(miniGameInput, null, 2, null));
    }

    public final void miniGameInputComment(EmomoRunGameGift emomoRunGameGift) {
        jo.p.h(emomoRunGameGift, "gameGift");
        getUnityCommandDispatcher().dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoRunGameGift(emomoRunGameGift), null, 2, null));
    }

    public final void miniGameInputReward(EmomoRunReward emomoRunReward, int i10) {
        jo.p.h(emomoRunReward, "reward");
        getUnityCommandDispatcher().dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoRunReward(emomoRunReward, i10), null, 2, null));
    }

    public final void miniGameParamEffect(EmomoRunGameEffect emomoRunGameEffect) {
        jo.p.h(emomoRunGameEffect, "effect");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.EmomoRunEffect(emomoRunGameEffect), null, 2, null));
    }

    public final void miniGameParamReward(EmomoRunReward emomoRunReward, int i10) {
        jo.p.h(emomoRunReward, "reward");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.EmomoRunReward(emomoRunReward, i10), null, 2, null));
    }

    public final void restoreCameraDolly() {
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCameraDolly(this.currentScale, null, 2, null));
    }

    public final void setAnimation(UnityAnimation unityAnimation, int i10) {
        jo.p.h(unityAnimation, "unityAnimation");
        setAvatarSlot(i10);
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetAnimationTrigger(unityAnimation.getRawValue(), null, 2, null));
    }

    public final void setAnimationTrigger(String str, int i10) {
        jo.p.h(str, "animationTrigger");
        setAvatarSlot(i10);
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetAnimationTrigger(str, null, 2, null));
    }

    public final void setAvatarSlot(int i10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetAvatarSlot(i10, null, 2, null));
        this.currentSlot = i10;
    }

    public final void setBackground(String str) {
        jo.p.h(str, "url");
        g9.a.f(Thread.currentThread().getStackTrace()[3]);
        g9.a.g("UnityManager.instance.setBackground(url): " + str);
        UnityCommandDispatcher unityCommandDispatcher = getUnityCommandDispatcher();
        unityCommandDispatcher.dispatch(new UnityCommand.SetContents("back_tex," + str, null, 2, null));
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetContents("back_color,#FFFFFFFF", null, 2, null));
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetContents("back_color_base,#FFFFFFFF", null, 2, null));
    }

    public final void setCameraDolly(CameraDolly cameraDolly) {
        jo.p.h(cameraDolly, "cameraDolly");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCameraDolly(cameraDolly.getRawValue(), null, 2, null));
    }

    public final void setCollabo001() {
        this.isGroupShot = false;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_001", null, 2, null));
    }

    public final void setCollabo003() {
        this.isGroupShot = false;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_003", null, 2, null));
    }

    public final void setCollabo004() {
        this.isGroupShot = true;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_004", null, 2, null));
    }

    public final void setCollaboGroupShot() {
        this.isGroupShot = true;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_GroupShot", null, 2, null));
    }

    public final void setCollaboMiniGame002() {
        this.isGroupShot = false;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_MiniGame_002", null, 2, null));
    }

    public final void setCollaboMiniGame004() {
        this.isGroupShot = false;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCollabo("Collabo_MiniGame_004", null, 2, null));
    }

    public final void setCompanionName(String str) {
        jo.p.h(str, "name");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCompanionName(str, null, 2, null));
    }

    public final void setGroupOrder(String str) {
        jo.p.h(str, "order");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetGroupOrder(str, null, 2, null));
    }

    public final void setGroupShot(boolean z10) {
        this.isGroupShot = z10;
    }

    public final void setInitializeState(InitializeState initializeState) {
        jo.p.h(initializeState, "<set-?>");
        this.initializeState = initializeState;
    }

    public final void setMainichi(int i10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetMainichi(i10, null, 2, null));
    }

    public final void setMouth(b bVar, ue.a aVar) {
        jo.p.h(bVar, "vowel");
        jo.p.h(aVar, "volume");
        setAvatarSlot(0);
        ff.c d10 = nd.r0.f42205a.d();
        d10.a("Avatar", "SetMouthWeight_" + bVar.c(), String.valueOf(aVar.e()));
        UnityPlayer.UnitySendMessage("Avatar", "SetMouthWeight_" + bVar.c(), String.valueOf(aVar.e()));
    }

    public final void setTranslucentBackground() {
        g9.a.f(Thread.currentThread().getStackTrace()[3]);
        g9.a.g("UnityManager.instance.setTranslucentBackground()");
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetContents("back_color,#00000000", null, 2, null));
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetContents("back_color_base,#00000000", null, 2, null));
    }

    public final void setUserTrackingInfo(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "uuid");
        if (str.length() == 0) {
            return;
        }
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetUserTrackingInfo(str, str2, null, 4, null));
    }

    public final void unloadAvatarModel(int i10) {
        getUnityCommandDispatcher().dispatch(new UnityCommand.UnloadAvatarSlot(i10, null, 2, null));
        getDispatcher().a(new UnityActionEvent.UnloadAvatarSlot(i10));
        this.loadAvatarStates.set(i10, LoadAvatarState.DEFAULT);
    }

    public final void unloadMiniGame() {
        getUnityCommandDispatcher().dispatch(new UnityCommand.UnloadMiniGame(null, 1, null));
        LoadAvatarState loadAvatarState = LoadAvatarState.DEFAULT;
        this.loadAvatarStates = s.e(loadAvatarState, loadAvatarState, loadAvatarState, loadAvatarState);
        getDispatcher().a(UnityActionEvent.FinishMiniGame.INSTANCE);
    }

    public final void updateAllParts(String str, ClosetAvatar closetAvatar, int i10) {
        jo.p.h(str, "message");
        jo.p.h(closetAvatar, "closetAvatar");
        setAvatarSlot(i10);
        getUnityCommandDispatcher().dispatch(new UnityCommand.UpdateAllParts(str, i10, null, 4, null));
        if (i10 == 0) {
            setPartsComment(closetAvatar);
        }
    }

    public final void setCameraDolly(float f10) {
        this.currentScale = f10;
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetCameraDolly(f10, null, 2, null));
    }

    public final void setPartsComment(k0 k0Var, String str) {
        String str2;
        jo.p.h(k0Var, "partsCategory");
        jo.p.h(str, "text");
        switch (WhenMappings.$EnumSwitchMapping$0[k0Var.ordinal()]) {
            case 1:
                str2 = "weapon";
                break;
            case 2:
                str2 = "lefthandweapon";
                break;
            case 3:
                str2 = "righthandweapon";
                break;
            case 4:
                str2 = "bothhandweapon";
                break;
            case 5:
                str2 = "rightinterior";
                break;
            case 6:
                str2 = "leftinterior";
                break;
            case 7:
                str2 = "centerinterior";
                break;
            default:
                return;
        }
        getUnityCommandDispatcher().dispatch(new UnityCommand.SetPartsComment(str2, str, null, 4, null));
    }
}
