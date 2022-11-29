package hf;

import android.util.Base64;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.unity.CallbackType;
import com.dena.mirrorman.unity.EmomoGameName;
import com.dena.mirrorman.unity.MiniGameOutputType;
import com.dena.mirrorman.unity.MultiEmomoGiftAnimationErrorLogInfo;
import com.dena.mirrorman.unity.MultiEmomoGiftAnimationLogInfo;
import com.dena.mirrorman.unity.ShooterAnalysisLogPayload;
import com.dena.mirrorman.unity.ShooterNotifyRoomId;
import com.dena.mirrorman.unity.UnityActionEvent;
import com.dena.mirrorman.unity.UnityCommand;
import com.dena.mirrorman.unity.UnityLoadAvatarModel;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoQuestLog;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunConsumeGift;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunGameOver;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunHeartBeat;
import com.dena.mirrorman.unity.UnityMiniGameOutputShooterGameOver;
import com.dena.mirrorman.unity.UnityMiniGameResult;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityUpdateAllParts;
import com.dena.mirrorman.unity.exception.UnityCallException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35569a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35570a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f35571b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f35572c;

        static {
            int[] iArr = new int[EmomoGameName.values().length];
            iArr[EmomoGameName.EMOMO_RUN.ordinal()] = 1;
            iArr[EmomoGameName.SHOOTER.ordinal()] = 2;
            iArr[EmomoGameName.FLAG_UP.ordinal()] = 3;
            iArr[EmomoGameName.EMOMO_QUEST.ordinal()] = 4;
            f35570a = iArr;
            int[] iArr2 = new int[MiniGameOutputType.values().length];
            iArr2[MiniGameOutputType.START.ordinal()] = 1;
            iArr2[MiniGameOutputType.TOUCH_TITLE.ordinal()] = 2;
            iArr2[MiniGameOutputType.OPEN_GIFT_TREASURE.ordinal()] = 3;
            iArr2[MiniGameOutputType.TOUCH_PLAYING.ordinal()] = 4;
            iArr2[MiniGameOutputType.TOUCH_RESULT_NEXT_TITLE.ordinal()] = 5;
            iArr2[MiniGameOutputType.TOUCH_RESULT_NEXT_START.ordinal()] = 6;
            iArr2[MiniGameOutputType.TOUCH_RESULT_SHARE.ordinal()] = 7;
            iArr2[MiniGameOutputType.TOUCH_RESULT_RANKING.ordinal()] = 8;
            iArr2[MiniGameOutputType.TOUCH_TITLE_RANKING.ordinal()] = 9;
            iArr2[MiniGameOutputType.TOUCH_HELP.ordinal()] = 10;
            iArr2[MiniGameOutputType.OPEN_GIFT_GACHA.ordinal()] = 11;
            iArr2[MiniGameOutputType.NOTIFY_ROOM_ID.ordinal()] = 12;
            iArr2[MiniGameOutputType.GAMEOVER.ordinal()] = 13;
            iArr2[MiniGameOutputType.REQUEST_AUTH_INFO.ordinal()] = 14;
            iArr2[MiniGameOutputType.PLAYING.ordinal()] = 15;
            iArr2[MiniGameOutputType.RESULT.ordinal()] = 16;
            iArr2[MiniGameOutputType.SHOW_COMMENT.ordinal()] = 17;
            iArr2[MiniGameOutputType.HIDE_COMMENT.ordinal()] = 18;
            iArr2[MiniGameOutputType.HEARTBEAT.ordinal()] = 19;
            iArr2[MiniGameOutputType.CONSUME_GIFT.ordinal()] = 20;
            iArr2[MiniGameOutputType.LOG.ordinal()] = 21;
            iArr2[MiniGameOutputType.WAITING.ordinal()] = 22;
            iArr2[MiniGameOutputType.CLOSE_GAME.ordinal()] = 23;
            iArr2[MiniGameOutputType.EMOMO_QUEST_CLOSE_GAME.ordinal()] = 24;
            iArr2[MiniGameOutputType.EMOMO_QUEST_TOUCH_RESULT_SHARE.ordinal()] = 25;
            iArr2[MiniGameOutputType.EMOMO_QUEST_TOUCH_RESULT_RANKING.ordinal()] = 26;
            iArr2[MiniGameOutputType.EMOMO_QUEST_TOUCH_TITLE_RANKING.ordinal()] = 27;
            iArr2[MiniGameOutputType.EMOMO_QUEST_TOUCH_HELP.ordinal()] = 28;
            iArr2[MiniGameOutputType.EMOMO_QUEST_GIFT_GACHA_PAGE.ordinal()] = 29;
            iArr2[MiniGameOutputType.EMOMO_QUEST_GIFT_GACHA_RESULT.ordinal()] = 30;
            iArr2[MiniGameOutputType.EMOMO_QUEST_OPEN_EQUIPMENT_GACHA.ordinal()] = 31;
            iArr2[MiniGameOutputType.EMOMO_QUEST_COMPLETE_OPEN_EQUIPMENT_GACHA_ANIMATION.ordinal()] = 32;
            iArr2[MiniGameOutputType.EMOMO_QUEST_UPDATE_AVATAR.ordinal()] = 33;
            iArr2[MiniGameOutputType.EMOMO_QUEST_LOG.ordinal()] = 34;
            iArr2[MiniGameOutputType.UNKNOWN.ordinal()] = 35;
            f35571b = iArr2;
            int[] iArr3 = new int[CallbackType.values().length];
            iArr3[CallbackType.COMPLETE.ordinal()] = 1;
            iArr3[CallbackType.MINI_GAME.ordinal()] = 2;
            iArr3[CallbackType.ERROR.ordinal()] = 3;
            iArr3[CallbackType.UNKNOWN.ordinal()] = 4;
            f35572c = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hf.n
    public UnityActionEvent a(String str) {
        String str2;
        List r02;
        String str3;
        Object obj;
        String str4;
        List r03;
        String str5;
        List r04;
        String str6;
        Object obj2;
        String str7;
        List r05;
        String str8;
        List r06;
        String str9;
        jo.p.h(str, "message");
        List r07 = so.o.r0(str, new String[]{";"}, false, 0, 6, null);
        if (r07.size() <= 2) {
            return null;
        }
        String str10 = (String) r07.get(0);
        String str11 = (String) r07.get(2);
        String str12 = (String) xn.a0.a0(r07, 3);
        String str13 = "";
        if (str12 == null) {
            str12 = "";
        }
        int i10 = b.f35572c[CallbackType.Companion.fromString(str10).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    g9.a.c(new UnityCallException(str));
                    if (jo.p.c(str11, UnityCommand.InitAssetBundle.class.getSimpleName())) {
                        return UnityActionEvent.InitAssetBundleFailed.INSTANCE;
                    }
                    if (jo.p.c(str11, UnityCommand.LoadAvatarModel.class.getSimpleName())) {
                        return UnityActionEvent.LoadAvatarModelFailed.INSTANCE;
                    }
                    if (jo.p.c(str11, UnityCommand.UpdateAllParts.class.getSimpleName())) {
                        return UnityActionEvent.UpdateAllPartsFailed.INSTANCE;
                    }
                    if (jo.p.c(str11, UnityCommand.LoadMiniGame.class.getSimpleName())) {
                        return UnityActionEvent.LoadMiniGameFailed.INSTANCE;
                    }
                    if (jo.p.c(str11, "MultiEmomoGiftAnimation")) {
                        HashMap hashMap = new HashMap();
                        for (String str14 : so.o.r0((CharSequence) r07.get(4), new String[]{","}, false, 0, 6, null)) {
                            List r08 = so.o.r0(str14, new String[]{":"}, false, 0, 6, null);
                            hashMap.put(r08.get(0), r08.get(1));
                        }
                        Object obj3 = hashMap.get("live_sent_gift_id");
                        jo.p.e(obj3);
                        Object obj4 = hashMap.get("trigger");
                        jo.p.e(obj4);
                        MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo = new MultiEmomoGiftAnimationLogInfo((String) obj3, (String) obj4);
                        Object obj5 = hashMap.get(MRLog.PAYLOAD_KEY_ERROR);
                        jo.p.e(obj5);
                        return new UnityActionEvent.MultiEmomoGiftAnimationFailed(new MultiEmomoGiftAnimationErrorLogInfo(multiEmomoGiftAnimationLogInfo, (String) obj5));
                    } else if (jo.p.c(str11, "HttpRequestError")) {
                        HashMap hashMap2 = new HashMap();
                        for (String str15 : so.o.r0((CharSequence) r07.get(4), new String[]{","}, false, 0, 6, null)) {
                            List r09 = so.o.r0(str15, new String[]{":"}, false, 0, 6, null);
                            hashMap2.put(r09.get(0), r09.get(1));
                        }
                        String str16 = (String) hashMap2.get(MRLog.PAYLOAD_KEY_ERROR);
                        if (str16 != null) {
                            byte[] decode = Base64.decode(str16, 0);
                            jo.p.g(decode, "decode(it, Base64.DEFAULT)");
                            str13 = new String(decode, so.c.f52772b);
                        }
                        return new UnityActionEvent.HttpRequestFailed(str13);
                    } else {
                        return null;
                    }
                }
            } else if (jo.p.c(str11, "MiniGameOutput")) {
                HashMap hashMap3 = new HashMap();
                for (String str17 : so.o.r0((CharSequence) r07.get(4), new String[]{","}, false, 0, 6, null)) {
                    List r010 = so.o.r0(str17, new String[]{":"}, false, 0, 6, null);
                    hashMap3.put(r010.get(0), r010.get(1));
                }
                MiniGameOutputType.Companion companion = MiniGameOutputType.Companion;
                Object obj6 = hashMap3.get("output");
                jo.p.e(obj6);
                switch (b.f35571b[companion.fromString((String) obj6).ordinal()]) {
                    case 1:
                        EmomoGameName.Companion companion2 = EmomoGameName.Companion;
                        Object obj7 = hashMap3.get("MiniGameName");
                        jo.p.e(obj7);
                        return new UnityActionEvent.MiniGameOutputStarted(companion2.fromValue((String) obj7));
                    case 2:
                        EmomoGameName.Companion companion3 = EmomoGameName.Companion;
                        Object obj8 = hashMap3.get("MiniGameName");
                        jo.p.e(obj8);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchTitle(companion3.fromValue((String) obj8));
                    case 3:
                        EmomoGameName.Companion companion4 = EmomoGameName.Companion;
                        Object obj9 = hashMap3.get("MiniGameName");
                        jo.p.e(obj9);
                        EmomoGameName fromValue = companion4.fromValue((String) obj9);
                        Object obj10 = hashMap3.get("uid");
                        jo.p.e(obj10);
                        return new UnityActionEvent.MiniGameOutputEmomoRunOpenGiftTreasure(fromValue, Integer.parseInt((String) obj10));
                    case 4:
                        EmomoGameName.Companion companion5 = EmomoGameName.Companion;
                        Object obj11 = hashMap3.get("MiniGameName");
                        jo.p.e(obj11);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchPlaying(companion5.fromValue((String) obj11));
                    case 5:
                        EmomoGameName.Companion companion6 = EmomoGameName.Companion;
                        Object obj12 = hashMap3.get("MiniGameName");
                        jo.p.e(obj12);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchResultNextTitle(companion6.fromValue((String) obj12));
                    case 6:
                        EmomoGameName.Companion companion7 = EmomoGameName.Companion;
                        Object obj13 = hashMap3.get("MiniGameName");
                        jo.p.e(obj13);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchResultNextStart(companion7.fromValue((String) obj13));
                    case 7:
                        EmomoGameName.Companion companion8 = EmomoGameName.Companion;
                        Object obj14 = hashMap3.get("MiniGameName");
                        jo.p.e(obj14);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchResultShare(companion8.fromValue((String) obj14));
                    case 8:
                        EmomoGameName.Companion companion9 = EmomoGameName.Companion;
                        Object obj15 = hashMap3.get("MiniGameName");
                        jo.p.e(obj15);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchResultRanking(companion9.fromValue((String) obj15));
                    case 9:
                        EmomoGameName.Companion companion10 = EmomoGameName.Companion;
                        Object obj16 = hashMap3.get("MiniGameName");
                        jo.p.e(obj16);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchTitleRanking(companion10.fromValue((String) obj16));
                    case 10:
                        EmomoGameName.Companion companion11 = EmomoGameName.Companion;
                        Object obj17 = hashMap3.get("MiniGameName");
                        jo.p.e(obj17);
                        return new UnityActionEvent.MiniGameOutputEmomoRunTouchHelp(companion11.fromValue((String) obj17));
                    case 11:
                        EmomoGameName.Companion companion12 = EmomoGameName.Companion;
                        Object obj18 = hashMap3.get("MiniGameName");
                        jo.p.e(obj18);
                        return new UnityActionEvent.MiniGameOutputEmomoRunOpenGiftGacha(companion12.fromValue((String) obj18));
                    case 12:
                        EmomoGameName.Companion companion13 = EmomoGameName.Companion;
                        Object obj19 = hashMap3.get("MiniGameName");
                        jo.p.e(obj19);
                        EmomoGameName fromValue2 = companion13.fromValue((String) obj19);
                        Object obj20 = hashMap3.get("room_id");
                        jo.p.e(obj20);
                        return new UnityActionEvent.MiniGameOutputNotifyRoomId(new ShooterNotifyRoomId(fromValue2, (String) obj20));
                    case 13:
                        EmomoGameName.Companion companion14 = EmomoGameName.Companion;
                        Object obj21 = hashMap3.get("MiniGameName");
                        jo.p.e(obj21);
                        int i11 = b.f35570a[companion14.fromValue((String) obj21).ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3 || i11 == 4) {
                                    return null;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj22 = hashMap3.get("MiniGameName");
                            jo.p.e(obj22);
                            EmomoGameName fromValue3 = companion14.fromValue((String) obj22);
                            String str18 = (String) hashMap3.get("rank");
                            int parseInt = str18 != null ? Integer.parseInt(str18) : 0;
                            String str19 = (String) hashMap3.get("kick_num");
                            int parseInt2 = str19 != null ? Integer.parseInt(str19) : 0;
                            String str20 = (String) hashMap3.get("life");
                            int parseInt3 = str20 != null ? Integer.parseInt(str20) : 0;
                            String str21 = (String) hashMap3.get("game_team_rank");
                            int parseInt4 = str21 != null ? Integer.parseInt(str21) : 0;
                            String str22 = (String) hashMap3.get("game_team_point");
                            int parseInt5 = str22 != null ? Integer.parseInt(str22) : 0;
                            String str23 = (String) hashMap3.get("wave_flag_num");
                            int parseInt6 = str23 != null ? Integer.parseInt(str23) : 0;
                            String str24 = (String) hashMap3.get("drop_flag_num");
                            return new UnityActionEvent.MiniGameOutputShooterGameOver(fromValue3, new UnityMiniGameOutputShooterGameOver(parseInt, parseInt2, parseInt3, parseInt4, parseInt5, parseInt6, str24 != null ? Integer.parseInt(str24) : 0));
                        }
                        Object obj23 = hashMap3.get("MiniGameName");
                        jo.p.e(obj23);
                        EmomoGameName fromValue4 = companion14.fromValue((String) obj23);
                        String str25 = (String) hashMap3.get("self_time");
                        int parseInt7 = str25 != null ? Integer.parseInt(str25) : 0;
                        String str26 = (String) hashMap3.get("self_run");
                        int parseInt8 = str26 != null ? Integer.parseInt(str26) : 0;
                        String str27 = (String) hashMap3.get("gifted_run");
                        int parseInt9 = str27 != null ? Integer.parseInt(str27) : 0;
                        String str28 = (String) hashMap3.get("stage_coins");
                        int parseInt10 = str28 != null ? Integer.parseInt(str28) : 0;
                        String str29 = (String) hashMap3.get("gifted_coins");
                        int parseInt11 = str29 != null ? Integer.parseInt(str29) : 0;
                        String str30 = (String) hashMap3.get("gifted_score");
                        int parseInt12 = str30 != null ? Integer.parseInt(str30) : 0;
                        String str31 = (String) hashMap3.get("kicks");
                        int parseInt13 = str31 != null ? Integer.parseInt(str31) : 0;
                        String str32 = (String) hashMap3.get("coin_bonus");
                        int parseInt14 = str32 != null ? Integer.parseInt(str32) : 0;
                        String str33 = (String) hashMap3.get("score");
                        int parseInt15 = str33 != null ? Integer.parseInt(str33) : 0;
                        String str34 = (String) hashMap3.get("preset_run_scaler");
                        float parseFloat = str34 != null ? Float.parseFloat(str34) : 0.0f;
                        String str35 = (String) hashMap3.get("score_run_multiple");
                        float parseFloat2 = str35 != null ? Float.parseFloat(str35) : 0.0f;
                        String str36 = (String) hashMap3.get("score_coin_multiple");
                        float parseFloat3 = str36 != null ? Float.parseFloat(str36) : 0.0f;
                        String str37 = (String) hashMap3.get("score_kicks_multiple");
                        float parseFloat4 = str37 != null ? Float.parseFloat(str37) : 0.0f;
                        String str38 = (String) hashMap3.get("stage_enemy_multiple");
                        return new UnityActionEvent.MiniGameOutputEmomoRunGameOver(fromValue4, new UnityMiniGameOutputEmomoRunGameOver(parseInt7, parseInt8, parseInt9, parseInt10, parseInt11, parseInt12, parseInt13, parseInt14, parseInt15, parseFloat, parseFloat2, parseFloat3, parseFloat4, str38 != null ? Integer.parseInt(str38) : 0));
                    case 14:
                        EmomoGameName.Companion companion15 = EmomoGameName.Companion;
                        Object obj24 = hashMap3.get("MiniGameName");
                        jo.p.e(obj24);
                        return new UnityActionEvent.MiniGameOutputRequestAuthInfo(companion15.fromValue((String) obj24));
                    case 15:
                        EmomoGameName.Companion companion16 = EmomoGameName.Companion;
                        Object obj25 = hashMap3.get("MiniGameName");
                        jo.p.e(obj25);
                        return new UnityActionEvent.MiniGameOutputPlaying(companion16.fromValue((String) obj25));
                    case 16:
                        EmomoGameName.Companion companion17 = EmomoGameName.Companion;
                        Object obj26 = hashMap3.get("MiniGameName");
                        jo.p.e(obj26);
                        EmomoGameName fromValue5 = companion17.fromValue((String) obj26);
                        String str39 = (String) hashMap3.get("score");
                        return new UnityActionEvent.MiniGameOutputResult(fromValue5, new UnityMiniGameResult(str39 != null ? Integer.parseInt(str39) : 0));
                    case 17:
                        EmomoGameName.Companion companion18 = EmomoGameName.Companion;
                        Object obj27 = hashMap3.get("MiniGameName");
                        jo.p.e(obj27);
                        return new UnityActionEvent.MiniGameOutputShowComment(companion18.fromValue((String) obj27));
                    case 18:
                        EmomoGameName.Companion companion19 = EmomoGameName.Companion;
                        Object obj28 = hashMap3.get("MiniGameName");
                        jo.p.e(obj28);
                        return new UnityActionEvent.MiniGameOutputHideComment(companion19.fromValue((String) obj28));
                    case 19:
                        EmomoGameName.Companion companion20 = EmomoGameName.Companion;
                        Object obj29 = hashMap3.get("MiniGameName");
                        jo.p.e(obj29);
                        EmomoGameName fromValue6 = companion20.fromValue((String) obj29);
                        String str40 = (String) hashMap3.get("self_time");
                        int parseInt16 = str40 != null ? Integer.parseInt(str40) : 0;
                        String str41 = (String) hashMap3.get("self_run");
                        int parseInt17 = str41 != null ? Integer.parseInt(str41) : 0;
                        String str42 = (String) hashMap3.get("gifted_run");
                        int parseInt18 = str42 != null ? Integer.parseInt(str42) : 0;
                        String str43 = (String) hashMap3.get("stage_coins");
                        int parseInt19 = str43 != null ? Integer.parseInt(str43) : 0;
                        String str44 = (String) hashMap3.get("gifted_coins");
                        int parseInt20 = str44 != null ? Integer.parseInt(str44) : 0;
                        String str45 = (String) hashMap3.get("gifted_score");
                        int parseInt21 = str45 != null ? Integer.parseInt(str45) : 0;
                        String str46 = (String) hashMap3.get("kicks");
                        int parseInt22 = str46 != null ? Integer.parseInt(str46) : 0;
                        String str47 = (String) hashMap3.get("coin_bonus");
                        int parseInt23 = str47 != null ? Integer.parseInt(str47) : 0;
                        String str48 = (String) hashMap3.get("score");
                        int parseInt24 = str48 != null ? Integer.parseInt(str48) : 0;
                        String str49 = (String) hashMap3.get("preset_run_scaler");
                        float parseFloat5 = str49 != null ? Float.parseFloat(str49) : 0.0f;
                        String str50 = (String) hashMap3.get("score_run_multiple");
                        float parseFloat6 = str50 != null ? Float.parseFloat(str50) : 0.0f;
                        String str51 = (String) hashMap3.get("score_coin_multiple");
                        float parseFloat7 = str51 != null ? Float.parseFloat(str51) : 0.0f;
                        String str52 = (String) hashMap3.get("score_kicks_multiple");
                        float parseFloat8 = str52 != null ? Float.parseFloat(str52) : 0.0f;
                        String str53 = (String) hashMap3.get("stage_enemy_multiple");
                        return new UnityActionEvent.MiniGameOutputEmomoRunHeartBeat(fromValue6, new UnityMiniGameOutputEmomoRunHeartBeat(parseInt16, parseInt17, parseInt18, parseInt19, parseInt20, parseInt21, parseInt22, parseInt23, parseInt24, parseFloat5, parseFloat6, parseFloat7, parseFloat8, str53 != null ? Integer.parseInt(str53) : 0));
                    case 20:
                        EmomoGameName.Companion companion21 = EmomoGameName.Companion;
                        Object obj30 = hashMap3.get("MiniGameName");
                        jo.p.e(obj30);
                        EmomoGameName fromValue7 = companion21.fromValue((String) obj30);
                        String str54 = (String) hashMap3.get("uid");
                        int parseInt25 = str54 != null ? Integer.parseInt(str54) : 0;
                        String str55 = (String) hashMap3.get("game_no");
                        return new UnityActionEvent.MiniGameOutputEmomoRunConsumeGift(fromValue7, new UnityMiniGameOutputEmomoRunConsumeGift(parseInt25, str55 != null ? Integer.parseInt(str55) : 0));
                    case 21:
                        EmomoGameName.Companion companion22 = EmomoGameName.Companion;
                        Object obj31 = hashMap3.get("MiniGameName");
                        jo.p.e(obj31);
                        EmomoGameName fromValue8 = companion22.fromValue((String) obj31);
                        String str56 = (String) hashMap3.get("payload");
                        if (str56 != null) {
                            byte[] decode2 = Base64.decode(str56, 0);
                            jo.p.g(decode2, "decode(it, Base64.DEFAULT)");
                            str13 = new String(decode2, so.c.f52772b);
                        }
                        return new UnityActionEvent.MiniGameOutputAnalysisLog(fromValue8, new ShooterAnalysisLogPayload(str13));
                    case 22:
                        EmomoGameName.Companion companion23 = EmomoGameName.Companion;
                        Object obj32 = hashMap3.get("MiniGameName");
                        jo.p.e(obj32);
                        return new UnityActionEvent.MiniGameOutputWaiting(companion23.fromValue((String) obj32));
                    case 23:
                        EmomoGameName.Companion companion24 = EmomoGameName.Companion;
                        Object obj33 = hashMap3.get("MiniGameName");
                        jo.p.e(obj33);
                        return new UnityActionEvent.MiniGameOutputCloseGame(companion24.fromValue((String) obj33));
                    case 24:
                        EmomoGameName.Companion companion25 = EmomoGameName.Companion;
                        Object obj34 = hashMap3.get("MiniGameName");
                        jo.p.e(obj34);
                        return new UnityActionEvent.MiniGameOutputCloseGame(companion25.fromValue((String) obj34));
                    case 25:
                        EmomoGameName.Companion companion26 = EmomoGameName.Companion;
                        Object obj35 = hashMap3.get("MiniGameName");
                        jo.p.e(obj35);
                        EmomoGameName fromValue9 = companion26.fromValue((String) obj35);
                        String str57 = (String) hashMap3.get("game_no");
                        return new UnityActionEvent.MiniGameOutputEmomoQuestTouchResultShare(fromValue9, str57 != null ? Integer.parseInt(str57) : 0);
                    case 26:
                        EmomoGameName.Companion companion27 = EmomoGameName.Companion;
                        Object obj36 = hashMap3.get("MiniGameName");
                        jo.p.e(obj36);
                        EmomoGameName fromValue10 = companion27.fromValue((String) obj36);
                        String str58 = (String) hashMap3.get("game_no");
                        return new UnityActionEvent.MiniGameOutputEmomoQuestTouchResultRanking(fromValue10, str58 != null ? Integer.parseInt(str58) : 0);
                    case 27:
                        EmomoGameName.Companion companion28 = EmomoGameName.Companion;
                        Object obj37 = hashMap3.get("MiniGameName");
                        jo.p.e(obj37);
                        return new UnityActionEvent.MiniGameOutputEmomoQuestTouchTitleRanking(companion28.fromValue((String) obj37));
                    case 28:
                        EmomoGameName.Companion companion29 = EmomoGameName.Companion;
                        Object obj38 = hashMap3.get("MiniGameName");
                        jo.p.e(obj38);
                        EmomoGameName fromValue11 = companion29.fromValue((String) obj38);
                        String str59 = (String) hashMap3.get("help_lp_url");
                        if (str59 != null) {
                            byte[] decode3 = Base64.decode(str59, 0);
                            jo.p.g(decode3, "decode(it, Base64.DEFAULT)");
                            str13 = new String(decode3, so.c.f52772b);
                        }
                        return new UnityActionEvent.MiniGameOutputEmomoQuestTouchHelp(fromValue11, str13);
                    case 29:
                        EmomoGameName.Companion companion30 = EmomoGameName.Companion;
                        Object obj39 = hashMap3.get("MiniGameName");
                        jo.p.e(obj39);
                        EmomoGameName fromValue12 = companion30.fromValue((String) obj39);
                        String str60 = (String) hashMap3.get("gacha_lp_url");
                        if (str60 != null) {
                            byte[] decode4 = Base64.decode(str60, 0);
                            jo.p.g(decode4, "decode(it, Base64.DEFAULT)");
                            str13 = new String(decode4, so.c.f52772b);
                        }
                        return new UnityActionEvent.MiniGameOutputOpenGiftGachaLp(fromValue12, str13);
                    case 30:
                        EmomoGameName.Companion companion31 = EmomoGameName.Companion;
                        Object obj40 = hashMap3.get("MiniGameName");
                        jo.p.e(obj40);
                        return new UnityActionEvent.MiniGameOutputEmomoQuestOpenGiftGacha(companion31.fromValue((String) obj40));
                    case 31:
                        EmomoGameName.Companion companion32 = EmomoGameName.Companion;
                        Object obj41 = hashMap3.get("MiniGameName");
                        jo.p.e(obj41);
                        EmomoGameName fromValue13 = companion32.fromValue((String) obj41);
                        String str61 = (String) hashMap3.get("gacha_type");
                        return new UnityActionEvent.MiniGameOutputEmomoQuestOpenEquipmentGacha(fromValue13, str61 != null ? Integer.parseInt(str61) : 0);
                    case 32:
                        EmomoGameName.Companion companion33 = EmomoGameName.Companion;
                        Object obj42 = hashMap3.get("MiniGameName");
                        jo.p.e(obj42);
                        return new UnityActionEvent.MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted(companion33.fromValue((String) obj42));
                    case 33:
                        EmomoGameName.Companion companion34 = EmomoGameName.Companion;
                        Object obj43 = hashMap3.get("MiniGameName");
                        jo.p.e(obj43);
                        EmomoGameName fromValue14 = companion34.fromValue((String) obj43);
                        String str62 = (String) hashMap3.get("part_type");
                        return new UnityActionEvent.MiniGameOutputUpdateAvatar(fromValue14, str62 != null ? Integer.parseInt(str62) : 0);
                    case 34:
                        EmomoGameName.Companion companion35 = EmomoGameName.Companion;
                        Object obj44 = hashMap3.get("MiniGameName");
                        jo.p.e(obj44);
                        EmomoGameName fromValue15 = companion35.fromValue((String) obj44);
                        String str63 = (String) hashMap3.get(ActionLogBase.ACTION_TYPE);
                        if (str63 == null) {
                            str63 = "";
                        }
                        String str64 = (String) hashMap3.get(MRLog.PAYLOAD_KEY_TARGET_DETAIL);
                        if (str64 != null) {
                            byte[] decode5 = Base64.decode(str64, 0);
                            jo.p.g(decode5, "decode(it, Base64.DEFAULT)");
                            str13 = new String(decode5, so.c.f52772b);
                        }
                        return new UnityActionEvent.MiniGameOutputEmomoQuestLog(fromValue15, new UnityMiniGameOutputEmomoQuestLog(str63, str13));
                    case 35:
                        g9.a.f32826a.b("Unity Error: Unknown output", new Object[0]);
                        return null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (jo.p.c(str11, UnityCommand.InitAssetBundle.class.getSimpleName())) {
            return UnityActionEvent.InitAssetBundleCompleted.INSTANCE;
        } else {
            if (jo.p.c(str11, UnityCommand.UnloadMiniGame.class.getSimpleName())) {
                return UnityActionEvent.UnloadMiniGameCompleted.INSTANCE;
            }
            if (jo.p.c(str11, UnityCommand.LoadAvatarModel.class.getSimpleName())) {
                Iterator it = r07.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (so.n.C((String) obj2, "Key", false, 2, null)) {
                        break;
                    }
                }
                String str65 = (String) obj2;
                if (str65 != null && (r06 = so.o.r0(str65, new String[]{":"}, false, 0, 6, null)) != null && (str9 = (String) xn.a0.i0(r06)) != null) {
                    str13 = str9;
                }
                Iterator it2 = r07.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str7 = null;
                        break;
                    }
                    Object next = it2.next();
                    if (so.n.C((String) next, "AndroidSlot", false, 2, null)) {
                        str7 = next;
                        break;
                    }
                }
                String str66 = str7;
                return new UnityActionEvent.LoadAvatarModelCompleted(new UnityLoadAvatarModel(str13, (str66 == null || (r05 = so.o.r0(str66, new String[]{":"}, false, 0, 6, null)) == null || (str8 = (String) xn.a0.i0(r05)) == null) ? 0 : Integer.parseInt(str8)));
            } else if (jo.p.c(str11, UnityCommand.UpdateAllParts.class.getSimpleName())) {
                Iterator it3 = r07.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (so.n.C((String) obj, "Key", false, 2, null)) {
                        break;
                    }
                }
                String str67 = (String) obj;
                if (str67 != null && (r04 = so.o.r0(str67, new String[]{":"}, false, 0, 6, null)) != null && (str6 = (String) xn.a0.i0(r04)) != null) {
                    str13 = str6;
                }
                Iterator it4 = r07.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str4 = null;
                        break;
                    }
                    Object next2 = it4.next();
                    if (so.n.C((String) next2, "AndroidSlot", false, 2, null)) {
                        str4 = next2;
                        break;
                    }
                }
                String str68 = str4;
                return new UnityActionEvent.UpdateAllPartsCompleted(new UnityUpdateAllParts(str13, (str68 == null || (r03 = so.o.r0(str68, new String[]{":"}, false, 0, 6, null)) == null || (str5 = (String) xn.a0.i0(r03)) == null) ? 0 : Integer.parseInt(str5)));
            } else if (jo.p.c(str11, UnityCommand.LoadMiniGame.class.getSimpleName())) {
                return new UnityActionEvent.LoadMiniGameCompleted(EmomoGameName.Companion.fromValue((String) r07.get(4)));
            } else {
                if (jo.p.c(str11, UnityCommand.CaptureScreenshot.class.getSimpleName())) {
                    if (jo.p.c(str12, "Capture")) {
                        List<String> r011 = so.o.r0((CharSequence) xn.a0.i0(so.o.r0(str, new String[]{";"}, false, 0, 6, null)), new String[]{","}, false, 0, 6, null);
                        for (String str69 : r011) {
                            if (so.n.C(str69, "isError", false, 2, null)) {
                                if (jo.p.c(xn.a0.i0(so.o.r0(str69, new String[]{":"}, false, 0, 6, null)), "True")) {
                                    return UnityActionEvent.ScreenshotFailed.INSTANCE;
                                }
                                wn.v vVar = wn.v.f59242a;
                                try {
                                    for (Object obj45 : r011) {
                                        if (so.n.C((String) obj45, "path", false, 2, null)) {
                                            String str70 = (String) xn.a0.i0(so.o.r0((CharSequence) obj45, new String[]{":"}, false, 0, 6, null));
                                            for (Object obj46 : r011) {
                                                if (so.n.C((String) obj46, "key", false, 2, null)) {
                                                    String str71 = (String) xn.a0.i0(so.o.r0((CharSequence) obj46, new String[]{":"}, false, 0, 6, null));
                                                    for (Object obj47 : r011) {
                                                        if (so.n.C((String) obj47, "pixel.height", false, 2, null)) {
                                                            int parseInt26 = Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj47, new String[]{":"}, false, 0, 6, null)));
                                                            String str72 = jo.p.c(str71, "null") ? null : str71;
                                                            String str73 = (String) xn.a0.i0(so.o.r0(str70, new String[]{"/"}, false, 0, 6, null));
                                                            for (Object obj48 : r011) {
                                                                if (so.n.C((String) obj48, "pixel.width", false, 2, null)) {
                                                                    int parseInt27 = Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj48, new String[]{":"}, false, 0, 6, null)));
                                                                    for (Object obj49 : r011) {
                                                                        if (so.n.C((String) obj49, "screenWidth", false, 2, null)) {
                                                                            int parseInt28 = Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj49, new String[]{":"}, false, 0, 6, null)));
                                                                            for (Object obj50 : r011) {
                                                                                if (so.n.C((String) obj50, "screenHeight", false, 2, null)) {
                                                                                    int parseInt29 = Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj50, new String[]{":"}, false, 0, 6, null)));
                                                                                    for (Object obj51 : r011) {
                                                                                        if (so.n.C((String) obj51, "position.x", false, 2, null)) {
                                                                                            int parseInt30 = Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj51, new String[]{":"}, false, 0, 6, null)));
                                                                                            for (Object obj52 : r011) {
                                                                                                if (so.n.C((String) obj52, "position.y", false, 2, null)) {
                                                                                                    int parseInt31 = parseInt26 - Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj52, new String[]{":"}, false, 0, 6, null)));
                                                                                                    for (Object obj53 : r011) {
                                                                                                        if (so.n.C((String) obj53, "size", false, 2, null)) {
                                                                                                            return new UnityActionEvent.ScreenshotCompleted(new UnityScreenshot(str72, str73, str70, parseInt27, parseInt26, parseInt28, parseInt29, parseInt30, parseInt31, Integer.parseInt((String) xn.a0.i0(so.o.r0((CharSequence) obj53, new String[]{":"}, false, 0, 6, null)))));
                                                                                                        }
                                                                                                    }
                                                                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                                                }
                                                                                            }
                                                                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                                        }
                                                                                    }
                                                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                                }
                                                                            }
                                                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                        }
                                                                    }
                                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                }
                                                            }
                                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                        }
                                                    }
                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                } catch (RuntimeException unused) {
                                    return UnityActionEvent.ScreenshotFailed.INSTANCE;
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                } else if (jo.p.c(str11, "MultiEmomoGiftAnimation")) {
                    HashMap hashMap4 = new HashMap();
                    for (String str74 : so.o.r0((CharSequence) r07.get(4), new String[]{","}, false, 0, 6, null)) {
                        List r012 = so.o.r0(str74, new String[]{":"}, false, 0, 6, null);
                        hashMap4.put(r012.get(0), r012.get(1));
                    }
                    String str75 = (String) hashMap4.get("status");
                    if (str75 != null) {
                        int hashCode = str75.hashCode();
                        if (hashCode != -1897185151) {
                            if (hashCode == -673660814 && str75.equals("finished")) {
                                Object obj54 = hashMap4.get("live_sent_gift_id");
                                jo.p.e(obj54);
                                Object obj55 = hashMap4.get("trigger");
                                jo.p.e(obj55);
                                return new UnityActionEvent.MultiEmomoGiftAnimationFinished(new MultiEmomoGiftAnimationLogInfo((String) obj54, (String) obj55));
                            }
                        } else if (str75.equals("started")) {
                            Object obj56 = hashMap4.get("live_sent_gift_id");
                            jo.p.e(obj56);
                            Object obj57 = hashMap4.get("trigger");
                            jo.p.e(obj57);
                            return new UnityActionEvent.MultiEmomoGiftAnimationStarted(new MultiEmomoGiftAnimationLogInfo((String) obj56, (String) obj57));
                        }
                    }
                } else if (jo.p.c(str11, "RichUniqueGiftAnimation")) {
                    return UnityActionEvent.RichUniqueGiftAnimationFinished.INSTANCE;
                } else {
                    if (jo.p.c(str11, "LiveGiftEffectKeyAnimation")) {
                        Iterator it5 = so.o.r0((CharSequence) xn.a0.i0(so.o.r0(str, new String[]{";"}, false, 0, 6, null)), new String[]{","}, false, 0, 6, null).iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                str2 = null;
                                break;
                            }
                            Object next3 = it5.next();
                            if (so.n.C((String) next3, "live_gift_effect_key", false, 2, null)) {
                                str2 = next3;
                                break;
                            }
                        }
                        String str76 = str2;
                        if (str76 != null && (r02 = so.o.r0(str76, new String[]{":"}, false, 0, 6, null)) != null && (str3 = (String) xn.a0.i0(r02)) != null) {
                            str13 = str3;
                        }
                        return new UnityActionEvent.LiveGiftEffectKeyAnimationFinished(str13);
                    }
                }
            }
        }
        return null;
    }
}
