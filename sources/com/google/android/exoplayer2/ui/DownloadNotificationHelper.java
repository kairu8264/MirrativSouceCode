package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import b3.j;

/* loaded from: classes3.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final j.e notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new j.e(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, int i10, PendingIntent pendingIntent, String str, int i11) {
        return buildNotification(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i10, PendingIntent pendingIntent, String str, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.notificationBuilder.D(i10);
        this.notificationBuilder.r(i11 == 0 ? null : context.getResources().getString(i11));
        this.notificationBuilder.p(pendingIntent);
        this.notificationBuilder.F(str != null ? new j.c().m(str) : null);
        this.notificationBuilder.B(i12, i13, z10);
        this.notificationBuilder.z(z11);
        this.notificationBuilder.C(z12);
        return this.notificationBuilder.c();
    }

    public Notification buildDownloadCompletedNotification(Context context, int i10, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i10, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i10, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i10, pendingIntent, str, R.string.exo_download_failed);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification buildProgressNotification(android.content.Context r21, int r22, android.app.PendingIntent r23, java.lang.String r24, java.util.List<com.google.android.exoplayer2.offline.Download> r25) {
        /*
            r20 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r7 = r0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r8 = r6
        L9:
            int r9 = r25.size()
            if (r3 >= r9) goto L45
            r9 = r25
            java.lang.Object r10 = r9.get(r3)
            com.google.android.exoplayer2.offline.Download r10 = (com.google.android.exoplayer2.offline.Download) r10
            int r11 = r10.state
            r12 = 5
            if (r11 != r12) goto L1e
            r5 = r0
            goto L42
        L1e:
            r12 = 7
            if (r11 == r12) goto L25
            r12 = 2
            if (r11 == r12) goto L25
            goto L42
        L25:
            float r4 = r10.getPercentDownloaded()
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 == 0) goto L31
            float r2 = r2 + r4
            r7 = r1
        L31:
            long r10 = r10.getBytesDownloaded()
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L3d
            r4 = r0
            goto L3e
        L3d:
            r4 = r1
        L3e:
            r8 = r8 | r4
            int r6 = r6 + 1
            r4 = r0
        L42:
            int r3 = r3 + 1
            goto L9
        L45:
            if (r4 == 0) goto L4b
            int r3 = com.google.android.exoplayer2.ui.R.string.exo_download_downloading
        L49:
            r14 = r3
            goto L51
        L4b:
            if (r5 == 0) goto L50
            int r3 = com.google.android.exoplayer2.ui.R.string.exo_download_removing
            goto L49
        L50:
            r14 = r1
        L51:
            if (r4 == 0) goto L61
            float r3 = (float) r6
            float r2 = r2 / r3
            int r2 = (int) r2
            if (r7 == 0) goto L5b
            if (r8 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            r17 = r0
            r16 = r2
            goto L65
        L61:
            r17 = r0
            r16 = r1
        L65:
            r15 = 100
            r18 = 1
            r19 = 0
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            android.app.Notification r0 = r9.buildNotification(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DownloadNotificationHelper.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List):android.app.Notification");
    }
}
