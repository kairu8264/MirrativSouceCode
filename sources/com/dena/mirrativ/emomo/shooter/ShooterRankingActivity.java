package com.dena.mirrativ.emomo.shooter;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.a5;
import be.b4;
import be.d4;
import be.i2;
import com.dena.mirrativ.emomo.shooter.ShooterRankingActivity;
import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.ShooterEventRankingInfoView;
import com.dena.mirrorman.customview.ShooterEventRankingUserSummaryView;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterRankingUser;
import com.dena.mirrorman.net.api.response.event.ShooterRatingClass;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import com.dena.mirrorman.net.api.response.event.ShooterUserDetail;
import com.dena.mirrorman.net.api.response.event.ShooterUserShooterSummary;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import ie.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import rd.z0;
import tb.c;
import ud.m3;
import ud.n1;
import ud.n3;
import ud.o1;
import ud.s1;
import ud.v3;
import ud.w3;
import ud.x0;
import ud.x3;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes.dex */
public final class ShooterRankingActivity extends e.b implements d4, ie.h, q0 {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f21348h0 = new a(null);

    /* renamed from: i0  reason: collision with root package name */
    public static final int f21349i0 = 8;

    /* renamed from: j0  reason: collision with root package name */
    public static final List<String> f21350j0 = xn.s.m(Referer.LIVE_VIEW, Referer.CLOSET);
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new l());
    public final wn.f Q = wn.g.a(new o0());
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21351a0;

    /* renamed from: b0  reason: collision with root package name */
    public s9.k f21352b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f21353c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f21354d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f21355e0;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21356f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21357g0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, int i10, Integer num, String str) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            Intent intent = new Intent(context, ShooterRankingActivity.class);
            intent.putExtra("EXTRA_SEASON_ID", i10);
            intent.putExtra("EXTRA_STREAMER_ID", num);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21358w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21359x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21360y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21358w = componentCallbacks;
            this.f21359x = aVar;
            this.f21360y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21358w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f21359x, this.f21360y);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements androidx.lifecycle.f0 {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [ud.a$a, jo.h] */
        /* JADX WARN: Type inference failed for: r5v74 */
        @Override // androidx.lifecycle.f0
        public final void d(T t10) {
            String str;
            String str2;
            int i10;
            String str3;
            String str4;
            ShooterEventResponse shooterEventResponse = (ShooterEventResponse) t10;
            if (shooterEventResponse != null) {
                v3.a aVar = v3.f55608p;
                Resources resources = ShooterRankingActivity.this.getResources();
                jo.p.g(resources, "resources");
                v3 a10 = aVar.a(resources, shooterEventResponse);
                s9.k kVar = ShooterRankingActivity.this.f21352b0;
                ?? r52 = 0;
                if (kVar == null) {
                    jo.p.v("binding");
                    kVar = null;
                }
                kVar.T(a10);
                s9.k kVar2 = ShooterRankingActivity.this.f21352b0;
                if (kVar2 == null) {
                    jo.p.v("binding");
                    kVar2 = null;
                }
                int i11 = 0;
                kVar2.u().setVisibility(0);
                s9.k kVar3 = ShooterRankingActivity.this.f21352b0;
                if (kVar3 == null) {
                    jo.p.v("binding");
                    kVar3 = null;
                }
                LandingPageDescriptionListView landingPageDescriptionListView = kVar3.C;
                o1 o1Var = new o1();
                List<Description> descriptions = shooterEventResponse.getDescriptions();
                ArrayList arrayList = new ArrayList(xn.t.u(descriptions, 10));
                Iterator<T> it = descriptions.iterator();
                while (true) {
                    str = "format(format, *args)";
                    str2 = "#%s";
                    i10 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    Description description = (Description) it.next();
                    n1 n1Var = new n1(r52, 1, r52);
                    String title = description.getTitle();
                    String text = description.getText();
                    jo.i0 i0Var = jo.i0.f38149a;
                    String format = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getDescriptionColor()}, 1));
                    jo.p.g(format, "format(format, *args)");
                    n1Var.a(title, text, Color.parseColor(format));
                    wn.v vVar = wn.v.f59242a;
                    arrayList.add(n1Var);
                    r52 = 0;
                }
                o1Var.a(arrayList, true, new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(shooterEventResponse.getDescriptionBackground().getStartColorInt()), Integer.valueOf(shooterEventResponse.getDescriptionBackground().getEndColorInt())))));
                wn.v vVar2 = wn.v.f59242a;
                landingPageDescriptionListView.w(o1Var);
                ShooterUserShooterSummary userShooterSummary = shooterEventResponse.getUserShooterSummary();
                if (userShooterSummary != null) {
                    s9.k kVar4 = ShooterRankingActivity.this.f21352b0;
                    if (kVar4 == null) {
                        jo.p.v("binding");
                        kVar4 = null;
                    }
                    ShooterEventRankingUserSummaryView shooterEventRankingUserSummaryView = kVar4.f52521v0;
                    n3.a aVar2 = n3.f55246s;
                    Context applicationContext = ShooterRankingActivity.this.getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    jo.i0 i0Var2 = jo.i0.f38149a;
                    String format2 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
                    jo.p.g(format2, "format(format, *args)");
                    int parseColor = Color.parseColor(format2);
                    String format3 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
                    jo.p.g(format3, "format(format, *args)");
                    shooterEventRankingUserSummaryView.b(aVar2.a(applicationContext, userShooterSummary, parseColor, Color.parseColor(format3)), new c());
                }
                ShooterUserDetail streamerRankReward = shooterEventResponse.getStreamerRankReward();
                if (streamerRankReward != null) {
                    s9.k kVar5 = ShooterRankingActivity.this.f21352b0;
                    if (kVar5 == null) {
                        jo.p.v("binding");
                        kVar5 = null;
                    }
                    ShooterEventRankingInfoView shooterEventRankingInfoView = kVar5.f52512m0;
                    m3.a aVar3 = m3.f55205s;
                    Context applicationContext2 = ShooterRankingActivity.this.getApplicationContext();
                    jo.p.g(applicationContext2, "applicationContext");
                    jo.i0 i0Var3 = jo.i0.f38149a;
                    String format4 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
                    jo.p.g(format4, "format(format, *args)");
                    int parseColor2 = Color.parseColor(format4);
                    String format5 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
                    jo.p.g(format5, "format(format, *args)");
                    shooterEventRankingInfoView.b(aVar3.a(applicationContext2, streamerRankReward, parseColor2, Color.parseColor(format5)), new d());
                }
                ShooterUserDetail streamerRatingRankReward = shooterEventResponse.getStreamerRatingRankReward();
                if (streamerRatingRankReward != null) {
                    s9.k kVar6 = ShooterRankingActivity.this.f21352b0;
                    if (kVar6 == null) {
                        jo.p.v("binding");
                        kVar6 = null;
                    }
                    ShooterEventRankingInfoView shooterEventRankingInfoView2 = kVar6.f52507h0;
                    m3.a aVar4 = m3.f55205s;
                    Context applicationContext3 = ShooterRankingActivity.this.getApplicationContext();
                    jo.p.g(applicationContext3, "applicationContext");
                    jo.i0 i0Var4 = jo.i0.f38149a;
                    String format6 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
                    jo.p.g(format6, "format(format, *args)");
                    int parseColor3 = Color.parseColor(format6);
                    String format7 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
                    jo.p.g(format7, "format(format, *args)");
                    shooterEventRankingInfoView2.b(aVar4.a(applicationContext3, streamerRatingRankReward, parseColor3, Color.parseColor(format7)), new e());
                }
                String achievedImageUrl = shooterEventResponse.getAchievedImageUrl();
                ShooterUserDetail scoreReward = shooterEventResponse.getScoreReward();
                if (scoreReward != null) {
                    int i12 = ShooterRankingActivity.this.f21354d0;
                    ShooterReward shooterReward = (ShooterReward) xn.a0.Z(scoreReward.getRewards());
                    int b10 = i12 + ((shooterReward != null ? shooterReward.getRarity() : 0) > 0 ? de.a.b(ShooterRankingActivity.this, 16) : 0);
                    s9.k kVar7 = ShooterRankingActivity.this.f21352b0;
                    if (kVar7 == null) {
                        jo.p.v("binding");
                        kVar7 = null;
                    }
                    RecyclerView.h adapter = kVar7.T.getAdapter();
                    rd.p pVar = adapter instanceof rd.p ? (rd.p) adapter : null;
                    if (pVar != null) {
                        List<ShooterReward> rewards = scoreReward.getRewards();
                        ArrayList arrayList2 = new ArrayList(xn.t.u(rewards, 10));
                        for (ShooterReward shooterReward2 : rewards) {
                            ud.d0 d0Var = new ud.d0(null, 1, null);
                            int i13 = ShooterRankingActivity.this.f21353c0;
                            ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                            int d10 = c3.a.d(shooterRankingActivity, shooterReward2.getAchieved() ? q9.d.G : q9.d.D);
                            int d11 = c3.a.d(ShooterRankingActivity.this, shooterReward2.getAchieved() ? q9.d.G : q9.d.D);
                            jo.i0 i0Var5 = jo.i0.f38149a;
                            Object[] objArr = new Object[1];
                            objArr[i11] = shooterEventResponse.getTotalScoreColor();
                            String format8 = String.format("#%s", Arrays.copyOf(objArr, 1));
                            jo.p.g(format8, "format(format, *args)");
                            int parseColor4 = Color.parseColor(format8);
                            float f10 = (float) ((ShooterRankingActivity.this.f21353c0 * 0.81d) / 2.0d);
                            ShooterRankingActivity shooterRankingActivity2 = ShooterRankingActivity.this;
                            if (shooterReward2.getAchieved()) {
                                i11 = 2;
                            }
                            d0Var.b(shooterReward2, achievedImageUrl, i13, b10, shooterRankingActivity.T3(d10, d11, parseColor4, f10, de.a.b(shooterRankingActivity2, i11)));
                            arrayList2.add(d0Var);
                            pVar = pVar;
                            i11 = 0;
                        }
                        pVar.f(arrayList2);
                    }
                    s9.k kVar8 = ShooterRankingActivity.this.f21352b0;
                    if (kVar8 == null) {
                        jo.p.v("binding");
                        kVar8 = null;
                    }
                    kVar8.T.getLayoutParams().height = ((int) Math.ceil(scoreReward.getRewards().size() / 4.0d)) * b10;
                    s9.k kVar9 = ShooterRankingActivity.this.f21352b0;
                    if (kVar9 == null) {
                        jo.p.v("binding");
                        kVar9 = null;
                    }
                    kVar9.T.requestLayout();
                }
                ShooterUserDetail rankReward = shooterEventResponse.getRankReward();
                if (rankReward != null) {
                    int i14 = ShooterRankingActivity.this.f21354d0;
                    ShooterReward shooterReward3 = (ShooterReward) xn.a0.Z(rankReward.getRewards());
                    int b11 = i14 + ((shooterReward3 != null ? shooterReward3.getRarity() : 0) > 0 ? de.a.b(ShooterRankingActivity.this, 16) : 0);
                    s9.k kVar10 = ShooterRankingActivity.this.f21352b0;
                    if (kVar10 == null) {
                        jo.p.v("binding");
                        kVar10 = null;
                    }
                    RecyclerView.h adapter2 = kVar10.R.getAdapter();
                    rd.p pVar2 = adapter2 instanceof rd.p ? (rd.p) adapter2 : null;
                    if (pVar2 != null) {
                        List<ShooterReward> rewards2 = rankReward.getRewards();
                        ArrayList arrayList3 = new ArrayList(xn.t.u(rewards2, 10));
                        Iterator<T> it2 = rewards2.iterator();
                        while (it2.hasNext()) {
                            ShooterReward shooterReward4 = (ShooterReward) it2.next();
                            ud.d0 d0Var2 = new ud.d0(null, i10, null);
                            int i15 = ShooterRankingActivity.this.f21353c0;
                            ShooterRankingActivity shooterRankingActivity3 = ShooterRankingActivity.this;
                            int d12 = c3.a.d(shooterRankingActivity3, shooterReward4.getAchieved() ? q9.d.G : q9.d.D);
                            int d13 = c3.a.d(ShooterRankingActivity.this, shooterReward4.getAchieved() ? q9.d.G : q9.d.D);
                            jo.i0 i0Var6 = jo.i0.f38149a;
                            String format9 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
                            jo.p.g(format9, "format(format, *args)");
                            Iterator<T> it3 = it2;
                            d0Var2.b(shooterReward4, achievedImageUrl, i15, b11, shooterRankingActivity3.T3(d12, d13, Color.parseColor(format9), (float) ((ShooterRankingActivity.this.f21353c0 * 0.81d) / 2.0d), de.a.b(ShooterRankingActivity.this, shooterReward4.getAchieved() ? 2 : 0)));
                            arrayList3.add(d0Var2);
                            it2 = it3;
                            i10 = 1;
                        }
                        pVar2.f(arrayList3);
                    }
                    s9.k kVar11 = ShooterRankingActivity.this.f21352b0;
                    if (kVar11 == null) {
                        jo.p.v("binding");
                        kVar11 = null;
                    }
                    kVar11.R.getLayoutParams().height = b11 * ((int) Math.ceil(rankReward.getRewards().size() / 4.0d));
                    s9.k kVar12 = ShooterRankingActivity.this.f21352b0;
                    if (kVar12 == null) {
                        jo.p.v("binding");
                        kVar12 = null;
                    }
                    kVar12.R.requestLayout();
                }
                ShooterUserDetail streamerScoreReward = shooterEventResponse.getStreamerScoreReward();
                if (streamerScoreReward != null) {
                    int i16 = ShooterRankingActivity.this.f21354d0;
                    ShooterReward shooterReward5 = (ShooterReward) xn.a0.Z(streamerScoreReward.getRewards());
                    int b12 = i16 + ((shooterReward5 != null ? shooterReward5.getRarity() : 0) > 0 ? de.a.b(ShooterRankingActivity.this, 16) : 0);
                    s9.k kVar13 = ShooterRankingActivity.this.f21352b0;
                    if (kVar13 == null) {
                        jo.p.v("binding");
                        kVar13 = null;
                    }
                    RecyclerView.h adapter3 = kVar13.f52515p0.getAdapter();
                    rd.p pVar3 = adapter3 instanceof rd.p ? (rd.p) adapter3 : null;
                    if (pVar3 != null) {
                        List<ShooterReward> rewards3 = streamerScoreReward.getRewards();
                        ArrayList arrayList4 = new ArrayList(xn.t.u(rewards3, 10));
                        Iterator<T> it4 = rewards3.iterator();
                        while (it4.hasNext()) {
                            ShooterReward shooterReward6 = (ShooterReward) it4.next();
                            ud.d0 d0Var3 = new ud.d0(null, 1, null);
                            int i17 = ShooterRankingActivity.this.f21353c0;
                            ShooterRankingActivity shooterRankingActivity4 = ShooterRankingActivity.this;
                            int d14 = c3.a.d(shooterRankingActivity4, shooterReward6.getAchieved() ? q9.d.G : q9.d.D);
                            int d15 = c3.a.d(ShooterRankingActivity.this, shooterReward6.getAchieved() ? q9.d.G : q9.d.D);
                            jo.i0 i0Var7 = jo.i0.f38149a;
                            String format10 = String.format("#%s", Arrays.copyOf(new Object[]{shooterEventResponse.getTotalScoreColor()}, 1));
                            jo.p.g(format10, "format(format, *args)");
                            Iterator<T> it5 = it4;
                            d0Var3.b(shooterReward6, achievedImageUrl, i17, b12, shooterRankingActivity4.T3(d14, d15, Color.parseColor(format10), (float) ((ShooterRankingActivity.this.f21353c0 * 0.81d) / 2.0d), de.a.b(ShooterRankingActivity.this, shooterReward6.getAchieved() ? 2 : 0)));
                            arrayList4.add(d0Var3);
                            it4 = it5;
                        }
                        pVar3.f(arrayList4);
                    }
                    s9.k kVar14 = ShooterRankingActivity.this.f21352b0;
                    if (kVar14 == null) {
                        jo.p.v("binding");
                        kVar14 = null;
                    }
                    kVar14.f52515p0.getLayoutParams().height = b12 * ((int) Math.ceil(streamerScoreReward.getRewards().size() / 4.0d));
                    s9.k kVar15 = ShooterRankingActivity.this.f21352b0;
                    if (kVar15 == null) {
                        jo.p.v("binding");
                        kVar15 = null;
                    }
                    kVar15.f52515p0.requestLayout();
                }
                String ratingAchievedImageUrl = shooterEventResponse.getRatingAchievedImageUrl();
                ShooterUserDetail ratingClassReward = shooterEventResponse.getRatingClassReward();
                if (ratingClassReward != null) {
                    int i18 = ShooterRankingActivity.this.f21354d0;
                    ShooterReward shooterReward7 = (ShooterReward) xn.a0.Z(ratingClassReward.getRewards());
                    int b13 = i18 + ((shooterReward7 != null ? shooterReward7.getRarity() : 0) > 0 ? de.a.b(ShooterRankingActivity.this, 16) : 0);
                    s9.k kVar16 = ShooterRankingActivity.this.f21352b0;
                    if (kVar16 == null) {
                        jo.p.v("binding");
                        kVar16 = null;
                    }
                    RecyclerView.h adapter4 = kVar16.K.getAdapter();
                    rd.p pVar4 = adapter4 instanceof rd.p ? (rd.p) adapter4 : null;
                    if (pVar4 == null) {
                        str3 = "format(format, *args)";
                        str4 = "#%s";
                    } else {
                        List<ShooterReward> rewards4 = ratingClassReward.getRewards();
                        ArrayList arrayList5 = new ArrayList(xn.t.u(rewards4, 10));
                        for (ShooterReward shooterReward8 : rewards4) {
                            ud.d0 d0Var4 = new ud.d0(null, 1, null);
                            int i19 = ShooterRankingActivity.this.f21353c0;
                            ShooterRankingActivity shooterRankingActivity5 = ShooterRankingActivity.this;
                            int d16 = c3.a.d(shooterRankingActivity5, shooterReward8.getAchieved() ? q9.d.G : q9.d.D);
                            int d17 = c3.a.d(ShooterRankingActivity.this, shooterReward8.getAchieved() ? q9.d.G : q9.d.D);
                            jo.i0 i0Var8 = jo.i0.f38149a;
                            String format11 = String.format(str2, Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
                            jo.p.g(format11, str);
                            String str5 = str;
                            String str6 = str2;
                            d0Var4.b(shooterReward8, ratingAchievedImageUrl, i19, b13, shooterRankingActivity5.T3(d16, d17, Color.parseColor(format11), (float) ((ShooterRankingActivity.this.f21353c0 * 0.81d) / 2.0d), de.a.b(ShooterRankingActivity.this, shooterReward8.getAchieved() ? 2 : 0)));
                            arrayList5.add(d0Var4);
                            str2 = str6;
                            str = str5;
                        }
                        str3 = str;
                        str4 = str2;
                        pVar4.f(arrayList5);
                    }
                    s9.k kVar17 = ShooterRankingActivity.this.f21352b0;
                    if (kVar17 == null) {
                        jo.p.v("binding");
                        kVar17 = null;
                    }
                    kVar17.K.getLayoutParams().height = b13 * ((int) Math.ceil(ratingClassReward.getRewards().size() / 4.0d));
                    s9.k kVar18 = ShooterRankingActivity.this.f21352b0;
                    if (kVar18 == null) {
                        jo.p.v("binding");
                        kVar18 = null;
                    }
                    kVar18.K.requestLayout();
                } else {
                    str3 = "format(format, *args)";
                    str4 = "#%s";
                }
                ShooterUserDetail ratingRankReward = shooterEventResponse.getRatingRankReward();
                if (ratingRankReward != null) {
                    int i20 = ShooterRankingActivity.this.f21354d0;
                    ShooterReward shooterReward9 = (ShooterReward) xn.a0.Z(ratingRankReward.getRewards());
                    int b14 = i20 + ((shooterReward9 != null ? shooterReward9.getRarity() : 0) > 0 ? de.a.b(ShooterRankingActivity.this, 16) : 0);
                    s9.k kVar19 = ShooterRankingActivity.this.f21352b0;
                    if (kVar19 == null) {
                        jo.p.v("binding");
                        kVar19 = null;
                    }
                    RecyclerView.h adapter5 = kVar19.M.getAdapter();
                    rd.p pVar5 = adapter5 instanceof rd.p ? (rd.p) adapter5 : null;
                    if (pVar5 != null) {
                        List<ShooterReward> rewards5 = ratingRankReward.getRewards();
                        ArrayList arrayList6 = new ArrayList(xn.t.u(rewards5, 10));
                        Iterator<T> it6 = rewards5.iterator();
                        while (it6.hasNext()) {
                            ShooterReward shooterReward10 = (ShooterReward) it6.next();
                            ud.d0 d0Var5 = new ud.d0(null, 1, null);
                            String ratingAchievedImageUrl2 = shooterEventResponse.getRatingAchievedImageUrl();
                            int i21 = ShooterRankingActivity.this.f21353c0;
                            ShooterRankingActivity shooterRankingActivity6 = ShooterRankingActivity.this;
                            int d18 = c3.a.d(shooterRankingActivity6, shooterReward10.getAchieved() ? q9.d.G : q9.d.D);
                            int d19 = c3.a.d(ShooterRankingActivity.this, shooterReward10.getAchieved() ? q9.d.G : q9.d.D);
                            jo.i0 i0Var9 = jo.i0.f38149a;
                            String str7 = str4;
                            String format12 = String.format(str7, Arrays.copyOf(new Object[]{shooterEventResponse.getRatingColor()}, 1));
                            Iterator<T> it7 = it6;
                            String str8 = str3;
                            jo.p.g(format12, str8);
                            ArrayList arrayList7 = arrayList6;
                            d0Var5.b(shooterReward10, ratingAchievedImageUrl2, i21, b14, shooterRankingActivity6.T3(d18, d19, Color.parseColor(format12), (float) ((ShooterRankingActivity.this.f21353c0 * 0.81d) / 2.0d), de.a.b(ShooterRankingActivity.this, shooterReward10.getAchieved() ? 2 : 0)));
                            arrayList7.add(d0Var5);
                            arrayList6 = arrayList7;
                            str3 = str8;
                            str4 = str7;
                            it6 = it7;
                        }
                        pVar5.f(arrayList6);
                    }
                    s9.k kVar20 = ShooterRankingActivity.this.f21352b0;
                    if (kVar20 == null) {
                        jo.p.v("binding");
                        kVar20 = null;
                    }
                    kVar20.M.getLayoutParams().height = b14 * ((int) Math.ceil(ratingRankReward.getRewards().size() / 4.0d));
                    s9.k kVar21 = ShooterRankingActivity.this.f21352b0;
                    if (kVar21 == null) {
                        jo.p.v("binding");
                        kVar21 = null;
                    }
                    kVar21.M.requestLayout();
                }
                s9.k kVar22 = ShooterRankingActivity.this.f21352b0;
                if (kVar22 == null) {
                    jo.p.v("binding");
                    kVar22 = null;
                }
                RecyclerView.h adapter6 = kVar22.Y.getAdapter();
                z0 z0Var = adapter6 instanceof z0 ? (z0) adapter6 : null;
                if (z0Var != null) {
                    z0Var.d(ShooterRankingActivity.this.U3(shooterEventResponse.getRankings(), shooterEventResponse.getTotalScoreColor(), shooterEventResponse.getTotalScoreColor(), shooterEventResponse.getRatingColor(), false));
                    wn.v vVar3 = wn.v.f59242a;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<od.j0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21362w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21363x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21364y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21362w = componentCallbacks;
            this.f21363x = aVar;
            this.f21364y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.j0, java.lang.Object] */
        @Override // io.a
        public final od.j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21362w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.j0.class), this.f21363x, this.f21364y);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<String, wn.v> {
        public c() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            ShooterRankingActivity.this.n4(str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<od.m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21366w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21367x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21366w = componentCallbacks;
            this.f21367x = aVar;
            this.f21368y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.m0, java.lang.Object] */
        @Override // io.a
        public final od.m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21366w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.m0.class), this.f21367x, this.f21368y);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<String, wn.v> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            ShooterRankingActivity.this.n4(str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<nf.j0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21370w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21371x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21372y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21370w = componentCallbacks;
            this.f21371x = aVar;
            this.f21372y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.j0, java.lang.Object] */
        @Override // io.a
        public final nf.j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21370w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.j0.class), this.f21371x, this.f21372y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<String, wn.v> {
        public e() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            ShooterRankingActivity.this.n4(str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21374w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21375x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21376y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21374w = componentCallbacks;
            this.f21375x = aVar;
            this.f21376y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f21374w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f21375x, this.f21376y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$observeStoreValues$2", f = "ShooterRankingActivity.kt", l = {635}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21377w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterRankingActivity f21379w;

            public a(ShooterRankingActivity shooterRankingActivity) {
                this.f21379w = shooterRankingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                wn.k a10;
                String liveId;
                if (str.length() == 0) {
                    return wn.v.f59242a;
                }
                Fragment e02 = this.f21379w.a3().e0("ShooterInviteBottomSheetDialogFragment");
                androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                if (eVar != null) {
                    eVar.n3();
                }
                if (this.f21379w.b4().a().c()) {
                    a10 = wn.q.a(MRLog.TARGET_TYPE_LIVER, this.f21379w.W3().b());
                } else {
                    String str2 = "";
                    if (jo.p.c(this.f21379w.Z3(), Referer.LIVE_VIEW)) {
                        te.c f10 = this.f21379w.Y3().j1().f();
                        if (f10 != null && (liveId = f10.getLiveId()) != null) {
                            str2 = liveId;
                        }
                        a10 = wn.q.a(MRLog.TARGET_TYPE_VIEWER, str2);
                    } else {
                        a10 = wn.q.a(MRLog.TARGET_TYPE_NOT_IN_LIVE, "");
                    }
                }
                MRLogger X3 = this.f21379w.X3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHOOTER_GO_PLAY);
                builder.setTargetType((String) a10.a());
                xm.e eVar2 = new xm.e();
                HashMap hashMap = new HashMap();
                hashMap.put(MRLog.PAYLOAD_KEY_LIVE_ID, (String) a10.b());
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar2.s(hashMap))));
                X3.sendLog(builder.build());
                Intent f11 = c.a.f(this.f21379w.V3(), this.f21379w, str, Referer.Event.SHOOTER_RANKING, null, null, false, false, true, false, null, 888, null);
                f11.addFlags(335544320);
                this.f21379w.f21356f0.a(f11);
                return vVar;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21377w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> j10 = ShooterRankingActivity.this.f4().j();
                a aVar = new a(ShooterRankingActivity.this);
                this.f21377w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21380w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21381x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21382y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21380w = componentCallbacks;
            this.f21381x = aVar;
            this.f21382y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21380w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f21381x, this.f21382y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$observeStoreValues$3", f = "ShooterRankingActivity.kt", l = {672}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21383w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterRankingActivity f21385w;

            public a(ShooterRankingActivity shooterRankingActivity) {
                this.f21385w = shooterRankingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                Fragment e02 = this.f21385w.a3().e0("ShooterInviteBottomSheetDialogFragment");
                androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                if (eVar != null) {
                    eVar.n3();
                }
                this.f21385w.finish();
                return wn.v.f59242a;
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21383w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> n10 = ShooterRankingActivity.this.f4().n();
                a aVar = new a(ShooterRankingActivity.this);
                this.f21383w = 1;
                if (n10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21386w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21387x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21388y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21386w = componentCallbacks;
            this.f21387x = aVar;
            this.f21388y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f21386w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f21387x, this.f21388y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$observeStoreValues$4", f = "ShooterRankingActivity.kt", l = {679}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21389w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterMatchingResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterRankingActivity f21391w;

            public a(ShooterRankingActivity shooterRankingActivity) {
                this.f21391w = shooterRankingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterMatchingResponse shooterMatchingResponse, ao.d<? super wn.v> dVar) {
                s9.k kVar = null;
                if (shooterMatchingResponse != null) {
                    s9.k kVar2 = this.f21391w.f21352b0;
                    if (kVar2 == null) {
                        jo.p.v("binding");
                        kVar2 = null;
                    }
                    kVar2.W.a(shooterMatchingResponse.getViewers());
                    s9.k kVar3 = this.f21391w.f21352b0;
                    if (kVar3 == null) {
                        jo.p.v("binding");
                    } else {
                        kVar = kVar3;
                    }
                    kVar.W.setVisibility(shooterMatchingResponse.getViewers().isEmpty() ? 8 : 0);
                } else {
                    s9.k kVar4 = this.f21391w.f21352b0;
                    if (kVar4 == null) {
                        jo.p.v("binding");
                    } else {
                        kVar = kVar4;
                    }
                    kVar.W.setVisibility(8);
                }
                return wn.v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21389w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<ShooterMatchingResponse> m10 = ShooterRankingActivity.this.f4().m();
                a aVar = new a(ShooterRankingActivity.this);
                this.f21389w = 1;
                if (m10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21392w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21393x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21394y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21392w = componentCallbacks;
            this.f21393x = aVar;
            this.f21394y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21392w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f21393x, this.f21394y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$observeStoreValues$5", f = "ShooterRankingActivity.kt", l = {690}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21395w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterRankingActivity f21397w;

            public a(ShooterRankingActivity shooterRankingActivity) {
                this.f21397w = shooterRankingActivity;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                s9.k kVar = this.f21397w.f21352b0;
                if (kVar == null) {
                    jo.p.v("binding");
                    kVar = null;
                }
                kVar.f52505f0.setVisibility((z10 && this.f21397w.b4().a().c()) ? 0 : 8);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21395w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<Boolean> f10 = ShooterRankingActivity.this.h4().f();
                a aVar = new a(ShooterRankingActivity.this);
                this.f21395w = 1;
                if (f10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21398w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentActivity componentActivity) {
            super(0);
            this.f21398w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21398w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$observeStoreValues$6", f = "ShooterRankingActivity.kt", l = {700}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21399w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterRankingActivity f21401w;

            public a(ShooterRankingActivity shooterRankingActivity) {
                this.f21401w = shooterRankingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    of.n.f45411a.B(this.f21401w, ((MRError.Failure) mRError).getErrorMessage(), false);
                } else if (mRError instanceof MRError.Blocked) {
                    of.n.f45411a.B(this.f21401w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                } else {
                    if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                        of.n.f45411a.l(this.f21401w, mRError);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f21401w);
                    }
                }
                return wn.v.f59242a;
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21399w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> l10 = ShooterRankingActivity.this.f4().l();
                a aVar = new a(ShooterRankingActivity.this);
                this.f21399w = 1;
                if (l10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class j0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21402w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21403x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21404y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21405z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21402w = aVar;
            this.f21403x = aVar2;
            this.f21404y = aVar3;
            this.f21405z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21402w;
            vq.a aVar2 = this.f21403x;
            io.a aVar3 = this.f21404y;
            xq.a aVar4 = this.f21405z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.d0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<String> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ShooterRankingActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class k0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21407w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ComponentActivity componentActivity) {
            super(0);
            this.f21407w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21407w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<Integer> {
        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(ShooterRankingActivity.this.getIntent().getIntExtra("EXTRA_SEASON_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class l0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21409w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentActivity componentActivity) {
            super(0);
            this.f21409w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21409w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends ViewOutlineProvider {
        public m() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.a.b(ShooterRankingActivity.this, 12));
        }
    }

    /* loaded from: classes.dex */
    public static final class m0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21411w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21412x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21413y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21414z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21411w = aVar;
            this.f21412x = aVar2;
            this.f21413y = aVar3;
            this.f21414z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21411w;
            vq.a aVar2 = this.f21412x;
            io.a aVar3 = this.f21413y;
            xq.a aVar4 = this.f21414z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.g0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<Integer, wn.v> {
        public n() {
            super(1);
        }

        public final void a(int i10) {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                ShooterUserDetail scoreReward = f10.getScoreReward();
                if (scoreReward != null) {
                    shooterRankingActivity.o4(scoreReward, i10, f10.getAchievedImageUrl());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21416w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ComponentActivity componentActivity) {
            super(0);
            this.f21416w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21416w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.l<View, wn.v> {
        public o() {
            super(1);
        }

        public final void a(View view) {
            ie.g a10;
            ShooterUserShooterSummary userShooterSummary;
            ShooterUserShooterSummary userShooterSummary2;
            ShooterRatingClass ratingClass;
            jo.p.h(view, "it");
            if (jo.p.c(ShooterRankingActivity.this.Z3(), Referer.CLOSET)) {
                of.n nVar = of.n.f45411a;
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                nVar.B(shooterRankingActivity, shooterRankingActivity.getString(q9.i.text_disabled_notice_while_in_closet), false);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (currentTimeMillis >= (f10 != null ? f10.getStartsAt() : 0)) {
                ShooterEventResponse f11 = ShooterRankingActivity.this.d4().g().f();
                if ((f11 != null ? f11.getEndsAt() : 0) >= currentTimeMillis) {
                    if (ShooterRankingActivity.this.b4().a().c()) {
                        ShooterRankingActivity.this.e4().f();
                        ShooterEventResponse f12 = ShooterRankingActivity.this.d4().g().f();
                        if (f12 == null || (userShooterSummary = f12.getUserShooterSummary()) == null) {
                            return;
                        }
                        int ratingPoint = userShooterSummary.getRatingPoint();
                        ShooterEventResponse f13 = ShooterRankingActivity.this.d4().g().f();
                        if (f13 == null || (userShooterSummary2 = f13.getUserShooterSummary()) == null || (ratingClass = userShooterSummary2.getRatingClass()) == null) {
                            return;
                        }
                        b4.f17692b1.a(ShooterRankingActivity.this.a4(), ratingPoint, ratingClass.getIconType()).z3(ShooterRankingActivity.this.a3(), "ShooterInviteBottomSheetDialogFragment");
                        return;
                    } else if (!jo.p.c(ShooterRankingActivity.this.Z3(), Referer.LIVE_VIEW)) {
                        ShooterRankingActivity.this.e4().a(Referer.Event.SHOOTER_RANKING);
                        return;
                    } else {
                        g.a aVar = ie.g.P0;
                        String string = ShooterRankingActivity.this.getString(q9.i.text_shooter_matching_confirmation_live_leave_title);
                        jo.p.g(string, "getString(R.string.text_…rmation_live_leave_title)");
                        a10 = aVar.a(string, (r15 & 2) != 0 ? null : ShooterRankingActivity.this.getString(q9.i.text_shooter_matching_confirmation_live_leave_description), (r15 & 4) != 0 ? 0 : q9.d.f48814r, (r15 & 8) != 0 ? 8388611 : 17, (r15 & 16) != 0 ? null : ShooterRankingActivity.this.getString(q9.i.text_shooter_matching_accept_matching_button_text2), (r15 & 32) == 0 ? q9.d.f48820x : 0, (r15 & 64) == 0 ? null : null);
                        a10.z3(ShooterRankingActivity.this.a3(), "DIALOG_TAG_SHOOTER_MATCHING_LEAVE_LIVE");
                        return;
                    }
                }
            }
            of.n nVar2 = of.n.f45411a;
            ShooterRankingActivity shooterRankingActivity2 = ShooterRankingActivity.this;
            nVar2.B(shooterRankingActivity2, shooterRankingActivity2.getString(q9.i.text_shooter_event_is_closed), false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o0 extends jo.q implements io.a<String> {
        public o0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            int intExtra = ShooterRankingActivity.this.getIntent().getIntExtra("EXTRA_STREAMER_ID", 0);
            if (intExtra == 0) {
                return null;
            }
            return String.valueOf(intExtra);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {
        public p() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ShooterRankingActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.l<Integer, wn.v> {
        public q() {
            super(1);
        }

        public final void a(int i10) {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                ShooterUserDetail rankReward = f10.getRankReward();
                if (rankReward != null) {
                    shooterRankingActivity.o4(rankReward, i10, f10.getAchievedImageUrl());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.l<Integer, wn.v> {
        public r() {
            super(1);
        }

        public final void a(int i10) {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                ShooterUserDetail ratingClassReward = f10.getRatingClassReward();
                if (ratingClassReward != null) {
                    shooterRankingActivity.o4(ratingClassReward, i10, f10.getRatingAchievedImageUrl());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.l<Integer, wn.v> {
        public s() {
            super(1);
        }

        public final void a(int i10) {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                ShooterUserDetail ratingRankReward = f10.getRatingRankReward();
                if (ratingRankReward != null) {
                    shooterRankingActivity.o4(ratingRankReward, i10, f10.getRatingAchievedImageUrl());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.l<Integer, wn.v> {
        public t() {
            super(1);
        }

        public final void a(int i10) {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                ShooterUserDetail scoreReward = f10.getScoreReward();
                if (scoreReward != null) {
                    shooterRankingActivity.o4(scoreReward, i10, f10.getAchievedImageUrl());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.l<Integer, wn.v> {
        public u() {
            super(1);
        }

        public final void a(int i10) {
            ShooterRankingActivity.this.n4(String.valueOf(i10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.l<String, wn.v> {
        public v() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            if (ShooterRankingActivity.f21350j0.contains(ShooterRankingActivity.this.Z3())) {
                return;
            }
            Intent f10 = c.a.f(ShooterRankingActivity.this.V3(), ShooterRankingActivity.this, str, Referer.Event.SHOOTER_RANKING, null, null, false, false, false, false, null, AnalyticsListener.EVENT_AUDIO_ATTRIBUTES_CHANGED, null);
            f10.addFlags(67108864);
            ShooterRankingActivity.this.f21356f0.a(f10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<wn.v> {
        public w() {
            super(0);
        }

        public final void a() {
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
                s9.k kVar = shooterRankingActivity.f21352b0;
                if (kVar == null) {
                    jo.p.v("binding");
                    kVar = null;
                }
                List U3 = kVar.f52517r0.getVisibility() == 0 ? shooterRankingActivity.U3(f10.getRankings(), f10.getTotalScoreColor(), f10.getTotalScoreColor(), f10.getRatingColor(), true) : shooterRankingActivity.U3(f10.getRatingRankings(), f10.getRatingColor(), f10.getTotalScoreColor(), f10.getRatingColor(), true);
                s9.k kVar2 = shooterRankingActivity.f21352b0;
                if (kVar2 == null) {
                    jo.p.v("binding");
                    kVar2 = null;
                }
                RecyclerView.h adapter = kVar2.Y.getAdapter();
                z0 z0Var = adapter instanceof z0 ? (z0) adapter : null;
                if (z0Var != null) {
                    z0Var.d(U3);
                }
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.l<View, wn.v> {
        public x() {
            super(1);
        }

        public final void a(View view) {
            String rulePopupImageUrl;
            jo.p.h(view, "it");
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 == null || (rulePopupImageUrl = f10.getRulePopupImageUrl()) == null) {
                return;
            }
            a5.O0.a(rulePopupImageUrl).z3(ShooterRankingActivity.this.a3(), "ShooterRuleDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.l<View, wn.v> {
        public y() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s9.k kVar = ShooterRankingActivity.this.f21352b0;
            if (kVar == null) {
                jo.p.v("binding");
                kVar = null;
            }
            ViewGroup.LayoutParams layoutParams = kVar.f52518s0.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.U = 0.6f;
            s9.k kVar2 = ShooterRankingActivity.this.f21352b0;
            if (kVar2 == null) {
                jo.p.v("binding");
                kVar2 = null;
            }
            kVar2.f52518s0.setLayoutParams(bVar);
            s9.k kVar3 = ShooterRankingActivity.this.f21352b0;
            if (kVar3 == null) {
                jo.p.v("binding");
                kVar3 = null;
            }
            AppCompatTextView appCompatTextView = kVar3.f52518s0;
            ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
            appCompatTextView.setTextSize(20.0f);
            appCompatTextView.setTextColor(c3.a.d(shooterRankingActivity.getApplicationContext(), q9.d.G));
            s9.k kVar4 = ShooterRankingActivity.this.f21352b0;
            if (kVar4 == null) {
                jo.p.v("binding");
                kVar4 = null;
            }
            AppCompatTextView appCompatTextView2 = kVar4.f52502c0;
            ShooterRankingActivity shooterRankingActivity2 = ShooterRankingActivity.this;
            appCompatTextView2.setTextSize(14.0f);
            appCompatTextView2.setTextColor(c3.a.d(shooterRankingActivity2.getApplicationContext(), q9.d.whiteThree60));
            s9.k kVar5 = ShooterRankingActivity.this.f21352b0;
            if (kVar5 == null) {
                jo.p.v("binding");
                kVar5 = null;
            }
            kVar5.f52517r0.setVisibility(0);
            s9.k kVar6 = ShooterRankingActivity.this.f21352b0;
            if (kVar6 == null) {
                jo.p.v("binding");
                kVar6 = null;
            }
            kVar6.f52500a0.setVisibility(8);
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity3 = ShooterRankingActivity.this;
                s9.k kVar7 = shooterRankingActivity3.f21352b0;
                if (kVar7 == null) {
                    jo.p.v("binding");
                    kVar7 = null;
                }
                ConstraintLayout constraintLayout = kVar7.X;
                jo.i0 i0Var = jo.i0.f38149a;
                String format = String.format("#%s", Arrays.copyOf(new Object[]{f10.getTotalScoreColor()}, 1));
                jo.p.g(format, "format(format, *args)");
                constraintLayout.setBackgroundColor(Color.parseColor(format));
                s9.k kVar8 = shooterRankingActivity3.f21352b0;
                if (kVar8 == null) {
                    jo.p.v("binding");
                    kVar8 = null;
                }
                RecyclerView.h adapter = kVar8.Y.getAdapter();
                z0 z0Var = adapter instanceof z0 ? (z0) adapter : null;
                if (z0Var != null) {
                    z0Var.d(shooterRankingActivity3.U3(f10.getRankings(), f10.getTotalScoreColor(), f10.getTotalScoreColor(), f10.getRatingColor(), false));
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.l<View, wn.v> {
        public z() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s9.k kVar = ShooterRankingActivity.this.f21352b0;
            if (kVar == null) {
                jo.p.v("binding");
                kVar = null;
            }
            ViewGroup.LayoutParams layoutParams = kVar.f52518s0.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.U = 0.4f;
            s9.k kVar2 = ShooterRankingActivity.this.f21352b0;
            if (kVar2 == null) {
                jo.p.v("binding");
                kVar2 = null;
            }
            kVar2.f52518s0.setLayoutParams(bVar);
            s9.k kVar3 = ShooterRankingActivity.this.f21352b0;
            if (kVar3 == null) {
                jo.p.v("binding");
                kVar3 = null;
            }
            AppCompatTextView appCompatTextView = kVar3.f52518s0;
            ShooterRankingActivity shooterRankingActivity = ShooterRankingActivity.this;
            appCompatTextView.setTextSize(14.0f);
            appCompatTextView.setTextColor(c3.a.d(shooterRankingActivity.getApplicationContext(), q9.d.whiteThree60));
            s9.k kVar4 = ShooterRankingActivity.this.f21352b0;
            if (kVar4 == null) {
                jo.p.v("binding");
                kVar4 = null;
            }
            AppCompatTextView appCompatTextView2 = kVar4.f52502c0;
            ShooterRankingActivity shooterRankingActivity2 = ShooterRankingActivity.this;
            appCompatTextView2.setTextSize(20.0f);
            appCompatTextView2.setTextColor(c3.a.d(shooterRankingActivity2.getApplicationContext(), q9.d.G));
            s9.k kVar5 = ShooterRankingActivity.this.f21352b0;
            if (kVar5 == null) {
                jo.p.v("binding");
                kVar5 = null;
            }
            kVar5.f52517r0.setVisibility(8);
            s9.k kVar6 = ShooterRankingActivity.this.f21352b0;
            if (kVar6 == null) {
                jo.p.v("binding");
                kVar6 = null;
            }
            kVar6.f52500a0.setVisibility(0);
            ShooterEventResponse f10 = ShooterRankingActivity.this.d4().g().f();
            if (f10 != null) {
                ShooterRankingActivity shooterRankingActivity3 = ShooterRankingActivity.this;
                s9.k kVar7 = shooterRankingActivity3.f21352b0;
                if (kVar7 == null) {
                    jo.p.v("binding");
                    kVar7 = null;
                }
                ConstraintLayout constraintLayout = kVar7.X;
                jo.i0 i0Var = jo.i0.f38149a;
                String format = String.format("#%s", Arrays.copyOf(new Object[]{f10.getRatingColor()}, 1));
                jo.p.g(format, "format(format, *args)");
                constraintLayout.setBackgroundColor(Color.parseColor(format));
                s9.k kVar8 = shooterRankingActivity3.f21352b0;
                if (kVar8 == null) {
                    jo.p.v("binding");
                    kVar8 = null;
                }
                RecyclerView.h adapter = kVar8.Y.getAdapter();
                z0 z0Var = adapter instanceof z0 ? (z0) adapter : null;
                if (z0Var != null) {
                    z0Var.d(shooterRankingActivity3.U3(f10.getRatingRankings(), f10.getRatingColor(), f10.getTotalScoreColor(), f10.getRatingColor(), false));
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public ShooterRankingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new a0(this, null, null));
        this.S = wn.g.b(iVar, new b0(this, null, null));
        this.T = new s0(jo.f0.b(nf.d0.class), new k0(this), new j0(new i0(this), null, null, gq.a.a(this)));
        this.U = wn.g.b(iVar, new c0(this, null, null));
        this.V = new s0(jo.f0.b(nf.g0.class), new n0(this), new m0(new l0(this), null, null, gq.a.a(this)));
        this.W = wn.g.b(iVar, new d0(this, null, null));
        this.X = wn.g.b(iVar, new e0(this, null, null));
        this.Y = wn.g.b(iVar, new f0(this, null, null));
        this.Z = wn.g.b(iVar, new g0(this, null, null));
        this.f21351a0 = wn.g.b(iVar, new h0(this, null, null));
        this.f21355e0 = wn.g.a(new k());
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ca.a
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ShooterRankingActivity.j4(ShooterRankingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…ERER, result.data))\n    }");
        this.f21356f0 = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: ca.b
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ShooterRankingActivity.m4(ShooterRankingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul…reamerId)\n        }\n    }");
        this.f21357g0 = V22;
    }

    public static final void j4(ShooterRankingActivity shooterRankingActivity, androidx.activity.result.a aVar) {
        jo.p.h(shooterRankingActivity, "this$0");
        shooterRankingActivity.startActivity(shooterRankingActivity.V3().x(shooterRankingActivity, Referer.Event.SHOOTER_RANKING, aVar.a()));
    }

    public static final void m4(ShooterRankingActivity shooterRankingActivity, androidx.activity.result.a aVar) {
        jo.p.h(shooterRankingActivity, "this$0");
        if (aVar.b() == -1) {
            shooterRankingActivity.c4().c(Referer.Event.SHOOTER_RANKING, shooterRankingActivity.a4(), false, shooterRankingActivity.g4());
        }
    }

    @Override // ie.h
    public void D2(String str) {
        jo.p.h(str, "tag");
    }

    public final Drawable T3(int i10, int i11, int i12, float f10, float f11) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(i10), Integer.valueOf(i11))));
        gradientDrawable.setStroke((int) f11, i12);
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public final List<ud.a> U3(List<ShooterRankingUser> list, String str, String str2, String str3, boolean z10) {
        List<ShooterRankingUser> subList = list.subList(0, z10 ? list.size() : Math.min(5, list.size()));
        ArrayList arrayList = new ArrayList(xn.t.u(subList, 10));
        int i10 = 0;
        for (Object obj : subList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            ShooterRankingUser shooterRankingUser = (ShooterRankingUser) obj;
            x3.a aVar = x3.Y;
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            String valueOf = String.valueOf(shooterRankingUser.getRatingPoint());
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{str}, 1));
            jo.p.g(format, "format(format, *args)");
            int parseColor = Color.parseColor(format);
            String format2 = String.format("#%s", Arrays.copyOf(new Object[]{str2}, 1));
            jo.p.g(format2, "format(format, *args)");
            int parseColor2 = Color.parseColor(format2);
            String format3 = String.format("#%s", Arrays.copyOf(new Object[]{str3}, 1));
            jo.p.g(format3, "format(format, *args)");
            arrayList.add(aVar.a(applicationContext, shooterRankingUser, valueOf, parseColor, parseColor2, Color.parseColor(format3), !f21350j0.contains(Z3()), i10 != subList.size() - 1));
            i10 = i11;
        }
        if (z10) {
            return arrayList;
        }
        ShooterEventResponse f10 = d4().g().f();
        String str4 = (f10 == null || (r3 = f10.getRankingLink()) == null) ? "" : "";
        jo.i0 i0Var2 = jo.i0.f38149a;
        String format4 = String.format("#%s", Arrays.copyOf(new Object[]{str}, 1));
        jo.p.g(format4, "format(format, *args)");
        return xn.a0.p0(arrayList, new w3(str4, Color.parseColor(format4), null, 4, null));
    }

    public final tb.c V3() {
        return (tb.c) this.Y.getValue();
    }

    public final kf.m W3() {
        return (kf.m) this.Z.getValue();
    }

    public final MRLogger X3() {
        return (MRLogger) this.f21351a0.getValue();
    }

    public final nf.z Y3() {
        return (nf.z) this.X.getValue();
    }

    public final String Z3() {
        return (String) this.f21355e0.getValue();
    }

    public final int a4() {
        return ((Number) this.P.getValue()).intValue();
    }

    public final i1 b4() {
        return (i1) this.R.getValue();
    }

    @Override // be.d4
    public void c0() {
        e4().g(Referer.Event.SHOOTER_RANKING);
    }

    public final od.j0 c4() {
        return (od.j0) this.S.getValue();
    }

    public final nf.d0 d4() {
        return (nf.d0) this.T.getValue();
    }

    public final od.m0 e4() {
        return (od.m0) this.U.getValue();
    }

    public final nf.g0 f4() {
        return (nf.g0) this.V.getValue();
    }

    @Override // be.d4
    public void g0() {
        e4().d(Referer.Event.SHOOTER_RANKING);
    }

    @Override // be.d4
    public void g1(int i10, int i11, String str, ShooterMemberType shooterMemberType) {
        Intent a10;
        jo.p.h(str, "stageId");
        jo.p.h(shooterMemberType, "hostMemberType");
        androidx.activity.result.c<Intent> cVar = this.f21357g0;
        a10 = ShooterGameActivity.f21208h0.a(this, shooterMemberType == ShooterMemberType.HOST, true, a4(), i11, i10, str, (r19 & 128) != 0 ? null : null);
        cVar.a(a10);
    }

    public final String g4() {
        return (String) this.Q.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final nf.j0 h4() {
        return (nf.j0) this.W.getValue();
    }

    public final void i4() {
        d4().g().i(this, new b());
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    public final void k4() {
        s9.k kVar = this.f21352b0;
        s9.k kVar2 = null;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        kVar.T.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$1
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar3 = this.f21352b0;
        if (kVar3 == null) {
            jo.p.v("binding");
            kVar3 = null;
        }
        kVar3.R.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$2
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar4 = this.f21352b0;
        if (kVar4 == null) {
            jo.p.v("binding");
            kVar4 = null;
        }
        kVar4.K.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$3
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar5 = this.f21352b0;
        if (kVar5 == null) {
            jo.p.v("binding");
            kVar5 = null;
        }
        kVar5.M.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$4
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar6 = this.f21352b0;
        if (kVar6 == null) {
            jo.p.v("binding");
            kVar6 = null;
        }
        kVar6.f52515p0.setLayoutManager(new GridLayoutManager(this) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$5
            {
                super((Context) this, 4, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar7 = this.f21352b0;
        if (kVar7 == null) {
            jo.p.v("binding");
            kVar7 = null;
        }
        RecyclerView recyclerView = kVar7.Y;
        s9.k kVar8 = this.f21352b0;
        if (kVar8 == null) {
            jo.p.v("binding");
            kVar8 = null;
        }
        final Context context = kVar8.u().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.dena.mirrativ.emomo.shooter.ShooterRankingActivity$setupLayout$6
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        s9.k kVar9 = this.f21352b0;
        if (kVar9 == null) {
            jo.p.v("binding");
            kVar9 = null;
        }
        kVar9.Y.setOutlineProvider(new m());
        s9.k kVar10 = this.f21352b0;
        if (kVar10 == null) {
            jo.p.v("binding");
        } else {
            kVar2 = kVar10;
        }
        kVar2.Y.setClipToOutline(true);
    }

    public final void l4() {
        s9.k kVar = this.f21352b0;
        s9.k kVar2 = null;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        RecyclerView recyclerView = kVar.T;
        rd.p pVar = new rd.p();
        pVar.d(new n());
        recyclerView.setAdapter(pVar);
        s9.k kVar3 = this.f21352b0;
        if (kVar3 == null) {
            jo.p.v("binding");
            kVar3 = null;
        }
        RecyclerView recyclerView2 = kVar3.R;
        rd.p pVar2 = new rd.p();
        pVar2.d(new q());
        recyclerView2.setAdapter(pVar2);
        s9.k kVar4 = this.f21352b0;
        if (kVar4 == null) {
            jo.p.v("binding");
            kVar4 = null;
        }
        RecyclerView recyclerView3 = kVar4.K;
        rd.p pVar3 = new rd.p();
        pVar3.d(new r());
        recyclerView3.setAdapter(pVar3);
        s9.k kVar5 = this.f21352b0;
        if (kVar5 == null) {
            jo.p.v("binding");
            kVar5 = null;
        }
        RecyclerView recyclerView4 = kVar5.M;
        rd.p pVar4 = new rd.p();
        pVar4.d(new s());
        recyclerView4.setAdapter(pVar4);
        s9.k kVar6 = this.f21352b0;
        if (kVar6 == null) {
            jo.p.v("binding");
            kVar6 = null;
        }
        RecyclerView recyclerView5 = kVar6.f52515p0;
        rd.p pVar5 = new rd.p();
        pVar5.d(new t());
        recyclerView5.setAdapter(pVar5);
        s9.k kVar7 = this.f21352b0;
        if (kVar7 == null) {
            jo.p.v("binding");
            kVar7 = null;
        }
        RecyclerView recyclerView6 = kVar7.Y;
        z0 z0Var = new z0();
        z0Var.i(new u());
        z0Var.h(new v());
        z0Var.g(new w());
        recyclerView6.setAdapter(z0Var);
        s9.k kVar8 = this.f21352b0;
        if (kVar8 == null) {
            jo.p.v("binding");
            kVar8 = null;
        }
        TextView textView = kVar8.f52504e0;
        jo.p.g(textView, "binding.ruleTextView");
        g1.a(textView, new x());
        s9.k kVar9 = this.f21352b0;
        if (kVar9 == null) {
            jo.p.v("binding");
            kVar9 = null;
        }
        AppCompatTextView appCompatTextView = kVar9.f52518s0;
        jo.p.g(appCompatTextView, "binding.totalScoreRewardTextView");
        g1.a(appCompatTextView, new y());
        s9.k kVar10 = this.f21352b0;
        if (kVar10 == null) {
            jo.p.v("binding");
            kVar10 = null;
        }
        AppCompatTextView appCompatTextView2 = kVar10.f52502c0;
        jo.p.g(appCompatTextView2, "binding.ratingRewardTextView");
        g1.a(appCompatTextView2, new z());
        s9.k kVar11 = this.f21352b0;
        if (kVar11 == null) {
            jo.p.v("binding");
            kVar11 = null;
        }
        View view = kVar11.G;
        jo.p.g(view, "binding.eventFooterPlayView");
        g1.a(view, new o());
        s9.k kVar12 = this.f21352b0;
        if (kVar12 == null) {
            jo.p.v("binding");
        } else {
            kVar2 = kVar12;
        }
        AppCompatImageView appCompatImageView = kVar2.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new p());
    }

    public final void n4(String str) {
        ShooterUserDetail rankReward;
        if (f21350j0.contains(Z3())) {
            return;
        }
        ShooterEventResponse f10 = d4().g().f();
        if (jo.p.c(str, String.valueOf((f10 == null || (rankReward = f10.getRankReward()) == null) ? null : Integer.valueOf(rankReward.getUserId())))) {
            startActivity(V3().z0(this));
        } else {
            startActivity(V3().s(this, str, Referer.Event.SHOOTER_RANKING));
        }
    }

    public final void o4(ShooterUserDetail shooterUserDetail, int i10, String str) {
        if (a3().e0("LandingPageRewardListDialog") != null) {
            return;
        }
        i2.a aVar = i2.Q0;
        List<ShooterReward> rewards = shooterUserDetail.getRewards();
        ArrayList arrayList = new ArrayList(xn.t.u(rewards, 10));
        for (ShooterReward shooterReward : rewards) {
            GiftItemEffect effect = shooterReward.getEffect();
            x0 b10 = effect != null ? x0.a.b(x0.I, this, effect, null, 4, null) : null;
            s1.a aVar2 = s1.O;
            String iconUrl = shooterReward.getIconUrl();
            String imageUrl = shooterReward.getImageUrl();
            String badgeUrl = shooterReward.getBadgeUrl();
            String str2 = shooterReward.getAchieved() ? str : "";
            String partTypeIconUrl = shooterReward.getPartTypeIconUrl();
            if (partTypeIconUrl == null) {
                partTypeIconUrl = "";
            }
            arrayList.add(aVar2.a(iconUrl, imageUrl, badgeUrl, str2, partTypeIconUrl, shooterReward.getName(), shooterReward.getRarity(), shooterReward.getCondition(), shooterReward.getDescription(), shooterReward.getDisabled(), b10));
        }
        aVar.a(arrayList, i10).z3(a3(), "LandingPageRewardListDialog");
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(16908290).setSystemUiVisibility(1280);
        ViewDataBinding g10 = androidx.databinding.f.g(this, q9.h.activity_shooter_ranking);
        jo.p.g(g10, "setContentView(this, R.l…activity_shooter_ranking)");
        s9.k kVar = (s9.k) g10;
        this.f21352b0 = kVar;
        s9.k kVar2 = null;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        kVar.M(this);
        s9.k kVar3 = this.f21352b0;
        if (kVar3 == null) {
            jo.p.v("binding");
        } else {
            kVar2 = kVar3;
        }
        kVar2.u().setVisibility(8);
        k4();
        l4();
        i4();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int b10 = (displayMetrics.widthPixels - de.a.b(this, 52)) / 4;
        this.f21353c0 = b10;
        this.f21354d0 = b10 + de.a.b(this, 14);
        c4().c(Referer.Event.SHOOTER_RANKING, a4(), false, g4());
        if (b4().a().c()) {
            e4().e(Referer.Event.SHOOTER_RANKING);
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // ie.h
    public void p(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_SHOOTER_MATCHING_LEAVE_LIVE")) {
            e4().a(Referer.Event.SHOOTER_RANKING);
        }
    }

    @Override // be.d4
    public void s0() {
        e4().a(Referer.Event.SHOOTER_RANKING);
    }
}
