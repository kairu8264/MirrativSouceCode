package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.f;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.glide.GlideApp;
import hb.v1;
import hb.x1;
import jo.h;
import jo.p;
import kb.f0;

/* loaded from: classes2.dex */
public final class GiftNotificationView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public final f0 f22676w;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22677a;

        static {
            int[] iArr = new int[GiftItem.Level.values().length];
            iArr[GiftItem.Level.GREEN.ordinal()] = 1;
            iArr[GiftItem.Level.BLUE.ordinal()] = 2;
            iArr[GiftItem.Level.RED.ordinal()] = 3;
            iArr[GiftItem.Level.SILVER.ordinal()] = 4;
            iArr[GiftItem.Level.GOLD.ordinal()] = 5;
            iArr[GiftItem.Level.RAINBOW.ordinal()] = 6;
            f22677a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftNotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ GiftNotificationView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setNotification(GiftItem giftItem) {
        String profileImageUrl;
        String giftSmallImageUrl;
        this.f22676w.H.setText(giftItem != null ? giftItem.getUserName() : null);
        this.f22676w.E.setText(giftItem != null ? giftItem.getGiftTitle() : null);
        if (giftItem != null && (giftSmallImageUrl = giftItem.getGiftSmallImageUrl()) != null) {
            ImageView imageView = this.f22676w.D;
            p.g(imageView, "binding.giftImage");
            td.a.f(imageView, giftSmallImageUrl);
        }
        if (giftItem != null && (profileImageUrl = giftItem.getProfileImageUrl()) != null) {
            GlideApp.with(getContext()).load(profileImageUrl).placeholder(v1.T).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f22676w.G);
        }
        GiftItem.Level level = giftItem != null ? giftItem.getLevel() : null;
        switch (level == null ? -1 : a.f22677a[level.ordinal()]) {
            case 1:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_green);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_green);
                break;
            case 2:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_blue);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_blue);
                break;
            case 3:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_red);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_red);
                break;
            case 4:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_silver);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_silver);
                break;
            case 5:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_gold);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_gold);
                break;
            case 6:
                this.f22676w.B.setBackgroundResource(v1.bg_gift_notification_rainbow);
                this.f22676w.F.setBackgroundResource(v1.bg_gift_notification_icon_rainbow);
                break;
        }
        if (giftItem != null) {
            int count = giftItem.getCount();
            if (count <= 1) {
                this.f22676w.C.setVisibility(8);
                return;
            }
            this.f22676w.C.setVisibility(0);
            this.f22676w.C.setCount(count);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftNotificationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f22676w = (f0) f.e(LayoutInflater.from(context), x1.view_gift_notification, this, true);
    }
}
