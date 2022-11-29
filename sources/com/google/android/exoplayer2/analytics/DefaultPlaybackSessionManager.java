package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final kk.n<String> DEFAULT_SESSION_ID_GENERATOR = f1.f26692w;
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final kk.n<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    /* loaded from: classes3.dex */
    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(String str, int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i10;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i10) {
            if (i10 < timeline.getWindowCount()) {
                timeline.getWindow(i10, DefaultPlaybackSessionManager.this.window);
                for (int i11 = DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i11 <= DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i11++) {
                    int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i11));
                    if (indexOfPeriod != -1) {
                        return timeline2.getPeriod(indexOfPeriod, DefaultPlaybackSessionManager.this.period).windowIndex;
                    }
                }
                return -1;
            } else if (i10 < timeline2.getWindowCount()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean belongsToSession(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return i10 == this.windowIndex;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
            return mediaPeriodId2 == null ? !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber : mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
            long j10 = this.windowSequenceNumber;
            if (j10 == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            } else if (mediaPeriodId.windowSequenceNumber > j10) {
                return true;
            } else {
                if (this.adMediaPeriodId == null) {
                    return false;
                }
                int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
                int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
                MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
                if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                    return false;
                }
                if (indexOfPeriod > indexOfPeriod2) {
                    return true;
                }
                if (mediaPeriodId2.isAd()) {
                    MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
                    int i10 = mediaPeriodId3.adGroupIndex;
                    int i11 = mediaPeriodId3.adIndexInAdGroup;
                    MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
                    int i12 = mediaPeriodId4.adGroupIndex;
                    return i10 > i12 || (i10 == i12 && i11 > mediaPeriodId4.adIndexInAdGroup);
                }
                int i13 = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i13 == -1 || i13 > this.adMediaPeriodId.adGroupIndex;
            }
        }

        public void maybeSetWindowSequenceNumber(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber == -1 && i10 == this.windowIndex && mediaPeriodId != null) {
                this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
            }
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
            int resolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = resolveWindowIndexToNewTimeline;
            if (resolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private SessionDescriptor getOrAddSession(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        int i11;
        SessionDescriptor sessionDescriptor = null;
        long j10 = Long.MAX_VALUE;
        for (SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i10, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i10, mediaPeriodId)) {
                long j11 = sessionDescriptor2.windowSequenceNumber;
                if (j11 == -1 || j11 < j10) {
                    sessionDescriptor = sessionDescriptor2;
                    j10 = j11;
                } else if (i11 == 0 && ((SessionDescriptor) Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor == null) {
            String str = this.sessionIdGenerator.get();
            SessionDescriptor sessionDescriptor3 = new SessionDescriptor(str, i10, mediaPeriodId);
            this.sessions.put(str, sessionDescriptor3);
            return sessionDescriptor3;
        }
        return sessionDescriptor;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            it.remove();
            if (next.isCreated && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.sessionId, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[Catch: all -> 0x010e, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x001b, B:9:0x0026, B:12:0x0030, B:19:0x0041, B:21:0x004d, B:22:0x0053, B:24:0x0057, B:26:0x005d, B:28:0x0076, B:30:0x00d1, B:32:0x00d7, B:34:0x00ed, B:36:0x00f9, B:38:0x00ff), top: B:44:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x00cd, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0011, B:11:0x001b, B:13:0x0021, B:15:0x002d, B:17:0x0036, B:20:0x0044, B:25:0x004f, B:26:0x0052, B:27:0x005c, B:29:0x007b, B:32:0x0083, B:34:0x008f, B:36:0x0095, B:38:0x00a1, B:40:0x00ad), top: B:46:0x0001 }] */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r6.listener     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lcd
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L10
            r2 = 3
            if (r8 != r2) goto Le
            goto L10
        Le:
            r8 = r0
            goto L11
        L10:
            r8 = r1
        L11:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r2 = r6.sessions     // Catch: java.lang.Throwable -> Lcd
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Lcd
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lcd
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r3     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = r3.isFinishedAtEventTime(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto L1b
            r2.remove()     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto L1b
            java.lang.String r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = r6.currentSessionId     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lcd
            if (r8 == 0) goto L4c
            if (r4 == 0) goto L4c
            boolean r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$400(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r5 == 0) goto L4c
            r5 = r1
            goto L4d
        L4c:
            r5 = r0
        L4d:
            if (r4 == 0) goto L52
            r4 = 0
            r6.currentSessionId = r4     // Catch: java.lang.Throwable -> Lcd
        L52:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r4 = r6.listener     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> Lcd
            r4.onSessionFinished(r7, r3, r5)     // Catch: java.lang.Throwable -> Lcd
            goto L1b
        L5c:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r8 = r6.sessions     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = r6.currentSessionId     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r8 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r8     // Catch: java.lang.Throwable -> Lcd
            int r0 = r7.windowIndex     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r0 = r6.getOrAddSession(r0, r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r0)     // Catch: java.lang.Throwable -> Lcd
            r6.currentSessionId = r1     // Catch: java.lang.Throwable -> Lcd
            r6.updateSessions(r7)     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lcb
            boolean r1 = r1.isAd()     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lcb
            if (r8 == 0) goto Lad
            long r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r8)     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            long r3 = r3.windowSequenceNumber     // Catch: java.lang.Throwable -> Lcd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lad
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lad
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Lcd
            int r1 = r1.adGroupIndex     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2.adGroupIndex     // Catch: java.lang.Throwable -> Lcd
            if (r1 != r2) goto Lad
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r8)     // Catch: java.lang.Throwable -> Lcd
            int r8 = r8.adIndexInAdGroup     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            int r1 = r1.adIndexInAdGroup     // Catch: java.lang.Throwable -> Lcd
            if (r8 == r1) goto Lcb
        Lad:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r7.mediaPeriodId     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r2 = r1.periodUid     // Catch: java.lang.Throwable -> Lcd
            long r3 = r1.windowSequenceNumber     // Catch: java.lang.Throwable -> Lcd
            r8.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lcd
            int r1 = r7.windowIndex     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r8 = r6.getOrAddSession(r1, r8)     // Catch: java.lang.Throwable -> Lcd
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r1 = r6.listener     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r0)     // Catch: java.lang.Throwable -> Lcd
            r1.onAdPlaybackStarted(r7, r8, r0)     // Catch: java.lang.Throwable -> Lcd
        Lcb:
            monitor-exit(r6)
            return
        Lcd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, int):void");
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        Assertions.checkNotNull(this.listener);
        Timeline timeline = this.currentTimeline;
        this.currentTimeline = eventTime.timeline;
        Iterator<SessionDescriptor> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            SessionDescriptor next = it.next();
            if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline)) {
                it.remove();
                if (next.isCreated) {
                    if (next.sessionId.equals(this.currentSessionId)) {
                        this.currentSessionId = null;
                    }
                    this.listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        }
        updateSessionsWithDiscontinuity(eventTime, 4);
    }

    public DefaultPlaybackSessionManager(kk.n<String> nVar) {
        this.sessionIdGenerator = nVar;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
    }
}
