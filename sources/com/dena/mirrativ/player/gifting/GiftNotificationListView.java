package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import ao.d;
import ao.g;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import de.n;
import hb.q1;
import hb.x1;
import io.p;
import java.util.LinkedList;
import jo.h;
import kb.h0;
import kotlin.NoWhenBranchMatchedException;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class GiftNotificationListView extends LinearLayout implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final h0 f22668w;

    /* renamed from: x  reason: collision with root package name */
    public final g f22669x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedList<GiftItem> f22670y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f22667z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @f(c = "com.dena.mirrativ.player.gifting.GiftNotificationListView$startAnimation$1", f = "GiftNotificationListView.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22671w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftNotificationView f22672x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GiftItem f22673y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ GiftNotificationListView f22674z;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22675a;

            static {
                int[] iArr = new int[GiftItem.Level.values().length];
                iArr[GiftItem.Level.GREEN.ordinal()] = 1;
                iArr[GiftItem.Level.BLUE.ordinal()] = 2;
                iArr[GiftItem.Level.RED.ordinal()] = 3;
                iArr[GiftItem.Level.SILVER.ordinal()] = 4;
                iArr[GiftItem.Level.GOLD.ordinal()] = 5;
                iArr[GiftItem.Level.RAINBOW.ordinal()] = 6;
                f22675a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GiftNotificationView giftNotificationView, GiftItem giftItem, GiftNotificationListView giftNotificationListView, d<? super b> dVar) {
            super(2, dVar);
            this.f22672x = giftNotificationView;
            this.f22673y = giftItem;
            this.f22674z = giftNotificationListView;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(this.f22672x, this.f22673y, this.f22674z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object c10 = c.c();
            int i11 = this.f22671w;
            if (i11 == 0) {
                m.b(obj);
                this.f22672x.setVisibility(0);
                this.f22672x.setNotification(this.f22673y);
                switch (a.f22675a[this.f22673y.getLevel().ordinal()]) {
                    case 1:
                        i10 = q1.gift_notification_slide_green;
                        break;
                    case 2:
                        i10 = q1.gift_notification_slide_blue;
                        break;
                    case 3:
                        i10 = q1.gift_notification_slide_red;
                        break;
                    case 4:
                        i10 = q1.gift_notification_slide_silver;
                        break;
                    case 5:
                        i10 = q1.gift_notification_slide_silver;
                        break;
                    case 6:
                        i10 = q1.gift_notification_slide_silver;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                GiftNotificationView giftNotificationView = this.f22672x;
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f22674z.getContext(), i10);
                jo.p.g(loadAnimation, "loadAnimation(context, animationResId)");
                this.f22671w = 1;
                if (n.d(giftNotificationView, loadAnimation, this) == c10) {
                    return c10;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            this.f22672x.setVisibility(4);
            this.f22672x.setNotification(null);
            if (!this.f22674z.f22670y.isEmpty()) {
                GiftNotificationListView giftNotificationListView = this.f22674z;
                Object poll = giftNotificationListView.f22670y.poll();
                jo.p.g(poll, "giftNotifications.poll()");
                giftNotificationListView.b((GiftItem) poll);
            }
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftNotificationListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ GiftNotificationListView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void b(GiftItem giftItem) {
        jo.p.h(giftItem, "item");
        if (giftItem.getTotalCoin() < 50) {
            return;
        }
        if (this.f22668w.B.getVisibility() != 0) {
            GiftNotificationView giftNotificationView = this.f22668w.B;
            jo.p.g(giftNotificationView, "binding.itemFirst");
            c(giftItem, giftNotificationView);
        } else if (this.f22668w.C.getVisibility() != 0) {
            GiftNotificationView giftNotificationView2 = this.f22668w.C;
            jo.p.g(giftNotificationView2, "binding.itemSecond");
            c(giftItem, giftNotificationView2);
        } else if (this.f22668w.D.getVisibility() != 0) {
            GiftNotificationView giftNotificationView3 = this.f22668w.D;
            jo.p.g(giftNotificationView3, "binding.itemThird");
            c(giftItem, giftNotificationView3);
        } else {
            this.f22670y.add(giftItem);
        }
    }

    public final void c(GiftItem giftItem, GiftNotificationView giftNotificationView) {
        uo.l.d(this, g1.c(), null, new b(giftNotificationView, giftItem, this, null), 2, null);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f22669x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r0.d(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftNotificationListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        jo.p.h(context, "context");
        this.f22668w = (h0) androidx.databinding.f.e(LayoutInflater.from(context), x1.view_gift_notification_list, this, true);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f22669x = c10.plus(b10);
        this.f22670y = new LinkedList<>();
    }
}
