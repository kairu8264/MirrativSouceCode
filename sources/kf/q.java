package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.p;

/* loaded from: classes2.dex */
public final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38729a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38730b;

    public q(Context context) {
        jo.p.h(context, "context");
        this.f38729a = context;
        this.f38730b = "NoticePref";
    }

    @Override // kf.p
    public long A() {
        return B5("NOTICE_YOURS_LATEST_TIME", 0L);
    }

    public void A5(String str, long j10) {
        p.a.c(this, str, j10);
    }

    public long B5(String str, long j10) {
        return p.a.d(this, str, j10);
    }

    @Override // kf.p
    public void C0(long j10) {
        A5("LIVE_GAME_LIST_COUNTS_LATEST_TIME", j10);
    }

    @Override // kf.p
    public long H4() {
        return B5("NOTICE_CAMPAIGN_RECOMMEND_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public long U() {
        return B5("NOTICE_CAMPAIGN_APP_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public void U1(long j10) {
        A5("NOTICE_YOURS_LATEST_TIME", j10);
    }

    @Override // kf.p
    public void Y2(long j10) {
        A5("NOTICE_CAMPAIGN_APP_LATEST_TIME", j10);
    }

    @Override // kf.p
    public void Z2(long j10) {
        A5("FOLLOW_CATALOG_LATEST_TIME", j10);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return p.a.b(this);
    }

    @Override // kf.p
    public long b5() {
        return B5("FOLLOW_CATALOG_LATEST_TIME", 0L);
    }

    @Override // kf.o
    public void clear() {
        p.a.a(this);
    }

    @Override // kf.p
    public long d3() {
        return B5("LIVE_GAME_LIST_COUNTS_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public long f3() {
        return B5("NOTICE_PRESENT_BOX_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public long g4() {
        return B5("NOTICE_CAMPAIGN_EMOMO_LATEST_TIME", 0L);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38729a;
    }

    @Override // kf.p
    public long i3() {
        return B5("NOTICE_CAMPAIGN_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public long l1() {
        return B5("NOTICE_OPE_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public void p(long j10) {
        A5("NOTICE_CAMPAIGN_RECOMMEND_LATEST_TIME", j10);
    }

    @Override // kf.p
    public void q0(long j10) {
        A5("NOTICE_CAMPAIGN_EMOMO_LATEST_TIME", j10);
    }

    @Override // kf.p
    public void q2(long j10) {
        A5("NOTICE_PRESENT_BOX_LATEST_TIME", j10);
    }

    @Override // kf.p
    public void r2(long j10) {
        A5("CHAT_THREADS_LATEST_TIME", j10);
    }

    @Override // kf.p
    public long v1() {
        return B5("CHAT_THREADS_LATEST_TIME", 0L);
    }

    @Override // kf.p
    public void w0(long j10) {
        A5("NOTICE_OPE_LATEST_TIME", j10);
    }

    @Override // kf.o
    public String z() {
        return this.f38730b;
    }
}
