package com.dena.mirrativ.streaming.emomo;

import ac.h5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import jo.h;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import xb.n;

/* loaded from: classes2.dex */
public final class GiftNameplateView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f23140x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f23141y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final h5 f23142w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23143a;

        static {
            int[] iArr = new int[GiftItem.Level.values().length];
            iArr[GiftItem.Level.GREEN.ordinal()] = 1;
            iArr[GiftItem.Level.BLUE.ordinal()] = 2;
            iArr[GiftItem.Level.RED.ordinal()] = 3;
            iArr[GiftItem.Level.SILVER.ordinal()] = 4;
            iArr[GiftItem.Level.GOLD.ordinal()] = 5;
            iArr[GiftItem.Level.RAINBOW.ordinal()] = 6;
            f23143a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftNameplateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ GiftNameplateView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a(GiftItem giftItem) {
        int i10;
        p.h(giftItem, "item");
        if (giftItem.getTotalCoin() < 50) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f23142w.B;
        switch (b.f23143a[giftItem.getLevel().ordinal()]) {
            case 1:
            case 2:
                i10 = n.bg_gift_nameplate_blue;
                break;
            case 3:
                i10 = n.bg_gift_nameplate_red;
                break;
            case 4:
                i10 = n.bg_gift_nameplate_silver;
                break;
            case 5:
                i10 = n.bg_gift_nameplate_gold;
                break;
            case 6:
                i10 = n.bg_gift_nameplate_rainbow;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i10);
        AppCompatImageView appCompatImageView2 = this.f23142w.C;
        p.g(appCompatImageView2, "binding.giftImage");
        appCompatImageView2.setVisibility(giftItem.getLevel().compareTo(GiftItem.Level.RED) >= 0 ? 0 : 8);
        this.f23142w.T(giftItem);
        this.f23142w.u().setVisibility(0);
    }

    public final void b() {
        this.f23142w.u().setVisibility(8);
        this.f23142w.T(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftNameplateView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f23142w = (h5) f.e(LayoutInflater.from(context), xb.p.view_gift_nameplate, this, true);
    }
}
