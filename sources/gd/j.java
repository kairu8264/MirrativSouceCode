package gd;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin.CoinHistory;
import com.dena.mirrativ.mirrativapi.user.Reward;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import jo.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f33247e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33248a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33249b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33250c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33251d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(Resources resources, CoinHistory coinHistory) {
            int i10;
            p.h(resources, "resources");
            p.h(coinHistory, "coinHistory");
            String format = new SimpleDateFormat("yyyy/M/d\nHH:mm:ss", k3.d.a(resources.getConfiguration()).c(0)).format(new Date(coinHistory.getCreatedAt() * 1000));
            String label = coinHistory.getLabel();
            String str = "";
            if (label == null) {
                label = "";
            }
            int type = coinHistory.getType();
            if (type == 1) {
                str = String.format("+ %,d", Arrays.copyOf(new Object[]{Integer.valueOf(coinHistory.getCoin())}, 1));
                p.g(str, "format(this, *args)");
            } else if (type == 2) {
                int coinType = coinHistory.getCoinType();
                if (coinType == 1) {
                    str = String.format("- %,d(" + resources.getString(sb.c.text_gift_panel_paid_coin_balance) + ')', Arrays.copyOf(new Object[]{Integer.valueOf(coinHistory.getCoin())}, 1));
                    p.g(str, "format(this, *args)");
                } else if (coinType == 2) {
                    str = String.format("- %,d(" + resources.getString(sb.c.text_gift_panel_free_coin_balance) + ')', Arrays.copyOf(new Object[]{Integer.valueOf(coinHistory.getCoin())}, 1));
                    p.g(str, "format(this, *args)");
                }
            }
            if (coinHistory.getType() == 1 && coinHistory.getCoinType() == 1) {
                i10 = sb.a.f52606e;
            } else {
                i10 = (coinHistory.getType() == 1 && coinHistory.getCoinType() == 2) ? sb.a.f52605d : sb.a.f52604c;
            }
            p.g(format, "dateTimeText");
            return new j(format, label, str, i10);
        }

        @SuppressLint({"SimpleDateFormat"})
        public final j b(Resources resources, Reward reward) {
            String str;
            StringBuilder sb2;
            String format;
            int i10;
            p.h(resources, "resources");
            p.h(reward, "coinHistory");
            String format2 = new SimpleDateFormat("yyyy/M/d\nHH:mm:ss").format(new Date(reward.getGivenAt() * 1000));
            String text = reward.getText();
            int rewardType = reward.getRewardType();
            if (rewardType == hd.p.COIN_GIFT.c() || rewardType == hd.p.CASH_BONUS.c()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("+ ￥");
                String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(reward.getAmount())}, 1));
                p.g(format3, "format(this, *args)");
                sb3.append(format3);
                str = sb3.toString();
            } else if (rewardType == hd.p.REWARD.c()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append((char) 65509);
                String format4 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(reward.getAmount())}, 1));
                p.g(format4, "format(this, *args)");
                sb4.append(format4);
                str = sb4.toString();
            } else if (rewardType == hd.p.TAX.c()) {
                if (reward.getAmount() == 0) {
                    sb2 = new StringBuilder();
                    sb2.append((char) 65509);
                    format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(reward.getAmount())}, 1));
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("- ￥");
                    format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(reward.getAmount())}, 1));
                }
                p.g(format, "format(this, *args)");
                sb2.append(format);
                str = sb2.toString();
            } else {
                str = "";
            }
            int rewardType2 = reward.getRewardType();
            if (rewardType2 == hd.p.REWARD.c()) {
                i10 = sb.a.f52603b;
            } else {
                i10 = rewardType2 == hd.p.TAX.c() ? sb.a.f52604c : sb.a.f52605d;
            }
            p.g(format2, "dateTimeText");
            return new j(format2, text, str, i10);
        }
    }

    public j(String str, String str2, String str3, int i10) {
        p.h(str, "dateTimeText");
        p.h(str2, "labelText");
        p.h(str3, "numberOfCurrencyText");
        this.f33248a = str;
        this.f33249b = str2;
        this.f33250c = str3;
        this.f33251d = i10;
    }

    public final String a() {
        return this.f33248a;
    }

    public final String b() {
        return this.f33249b;
    }

    public final String c() {
        return this.f33250c;
    }

    public final int d() {
        return this.f33251d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return p.c(this.f33248a, jVar.f33248a) && p.c(this.f33249b, jVar.f33249b) && p.c(this.f33250c, jVar.f33250c) && this.f33251d == jVar.f33251d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f33248a.hashCode() * 31) + this.f33249b.hashCode()) * 31) + this.f33250c.hashCode()) * 31) + Integer.hashCode(this.f33251d);
    }

    public String toString() {
        return "CurrencyHistoryBindModel(dateTimeText=" + this.f33248a + ", labelText=" + this.f33249b + ", numberOfCurrencyText=" + this.f33250c + ", numberOfCurrencyTextColor=" + this.f33251d + ')';
    }
}
