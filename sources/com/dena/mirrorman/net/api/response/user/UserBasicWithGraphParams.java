package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.user.YellRankType;
import com.dena.mirrorman.net.api.response.GiftResultItem;
import com.google.android.exoplayer2.C;
import java.util.List;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public class UserBasicWithGraphParams extends UserBasicParams {
    public static final int $stable = 8;
    private final String birthday;
    private final String birthdayEditableDate;
    private final int commentNum;
    private final int giftCoins;
    @b(BooleanTypeAdapter.class)
    private final boolean isAbleContinuousStreamHoliday;
    @b(BooleanTypeAdapter.class)
    private final boolean isBirthday;
    @b(BooleanTypeAdapter.class)
    private final boolean isBirthdayEditable;
    @b(BooleanTypeAdapter.class)
    private final boolean isBlocked;
    @b(BooleanTypeAdapter.class)
    private boolean isBlocking;
    @b(BooleanTypeAdapter.class)
    private final boolean isFollower;
    @b(BooleanTypeAdapter.class)
    private boolean isFollowing;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    private final long liveRequestNum;
    private final UserOnLive onlive;
    private final List<GiftResultItem> sentGifts;
    private final int thanksDisplayMaxNum;
    private int thanksSentNum;
    private int thanksStatus;
    private final int yellLevel;
    @b(YellRankType.TypeAdapter.class)
    private final YellRankType yellRank;

    public UserBasicWithGraphParams() {
        this(false, false, false, false, false, 0, null, 0, 0, 0, 0, null, 0L, false, null, null, false, false, null, 0, 1048575, null);
    }

    public /* synthetic */ UserBasicWithGraphParams(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, List list, int i11, int i12, int i13, int i14, UserOnLive userOnLive, long j10, boolean z15, String str, String str2, boolean z16, boolean z17, YellRankType yellRankType, int i15, int i16, h hVar) {
        this((i16 & 1) != 0 ? false : z10, (i16 & 2) != 0 ? false : z11, (i16 & 4) != 0 ? false : z12, (i16 & 8) != 0 ? false : z13, (i16 & 16) != 0 ? false : z14, (i16 & 32) != 0 ? 0 : i10, (i16 & 64) != 0 ? null : list, (i16 & 128) != 0 ? 0 : i11, (i16 & 256) != 0 ? 0 : i12, (i16 & 512) != 0 ? 0 : i13, (i16 & 1024) != 0 ? 0 : i14, (i16 & 2048) == 0 ? userOnLive : null, (i16 & 4096) != 0 ? 0L : j10, (i16 & 8192) != 0 ? false : z15, (i16 & 16384) != 0 ? "" : str, (i16 & 32768) == 0 ? str2 : "", (i16 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z16, (i16 & 131072) != 0 ? false : z17, (i16 & 262144) != 0 ? YellRankType.NONE : yellRankType, (i16 & 524288) != 0 ? 0 : i15);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getBirthdayEditableDate() {
        return this.birthdayEditableDate;
    }

    public final int getCommentNum() {
        return this.commentNum;
    }

    public final int getGiftCoins() {
        return this.giftCoins;
    }

    public final long getLiveRequestNum() {
        return this.liveRequestNum;
    }

    public final UserOnLive getOnlive() {
        return this.onlive;
    }

    public final List<GiftResultItem> getSentGifts() {
        return this.sentGifts;
    }

    public final int getThanksDisplayMaxNum() {
        return this.thanksDisplayMaxNum;
    }

    public final int getThanksSentNum() {
        return this.thanksSentNum;
    }

    public final int getThanksStatus() {
        return this.thanksStatus;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final YellRankType getYellRank() {
        return this.yellRank;
    }

    public final boolean isAbleContinuousStreamHoliday() {
        return this.isAbleContinuousStreamHoliday;
    }

    public final boolean isBirthday() {
        return this.isBirthday;
    }

    public final boolean isBirthdayEditable() {
        return this.isBirthdayEditable;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }

    public final boolean isFollower() {
        return this.isFollower;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public final void setBlocking(boolean z10) {
        this.isBlocking = z10;
    }

    public final void setFollowing(boolean z10) {
        this.isFollowing = z10;
    }

    public final void setThanksSentNum(int i10) {
        this.thanksSentNum = i10;
    }

    public final void setThanksStatus(int i10) {
        this.thanksStatus = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserBasicWithGraphParams(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, List<GiftResultItem> list, int i11, int i12, int i13, int i14, UserOnLive userOnLive, long j10, boolean z15, String str, String str2, boolean z16, boolean z17, YellRankType yellRankType, int i15) {
        super(null, null, null, null, null, 0, null, null, null, null, null, 0, false, false, 0L, false, false, false, 0, 524287, null);
        p.h(str, "birthday");
        p.h(str2, "birthdayEditableDate");
        p.h(yellRankType, "yellRank");
        this.isFollowing = z10;
        this.isFollower = z11;
        this.isModerator = z12;
        this.isBlocking = z13;
        this.isBlocked = z14;
        this.commentNum = i10;
        this.sentGifts = list;
        this.giftCoins = i11;
        this.thanksStatus = i12;
        this.thanksSentNum = i13;
        this.thanksDisplayMaxNum = i14;
        this.onlive = userOnLive;
        this.liveRequestNum = j10;
        this.isAbleContinuousStreamHoliday = z15;
        this.birthday = str;
        this.birthdayEditableDate = str2;
        this.isBirthday = z16;
        this.isBirthdayEditable = z17;
        this.yellRank = yellRankType;
        this.yellLevel = i15;
    }
}
