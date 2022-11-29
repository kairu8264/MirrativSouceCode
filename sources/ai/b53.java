package ai;

/* loaded from: classes3.dex */
public final class b53<V> implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public e53<V> f2248w;

    public b53(e53<V> e53Var) {
        this.f2248w = e53Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r1 = r0.D;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            ai.e53<V> r0 = r10.f2248w
            if (r0 != 0) goto L5
            return
        L5:
            ai.s43 r1 = ai.e53.F(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r10.f2248w = r2
            boolean r3 = r1.isDone()
            if (r3 == 0) goto L19
            r0.w(r1)
            return
        L19:
            r3 = 1
            java.util.concurrent.ScheduledFuture r4 = ai.e53.G(r0)     // Catch: java.lang.Throwable -> L8c
            ai.e53.H(r0, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "Timed out"
            if (r4 == 0) goto L54
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L52
            long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L52
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L52
            r8 = 10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r8 = 75
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L52
            r4.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = " (timeout delayed by "
            r4.append(r8)     // Catch: java.lang.Throwable -> L52
            r4.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = " ms after scheduled time)"
            r4.append(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
            r5 = r4
            goto L54
        L52:
            r4 = move-exception
            goto L83
        L54:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L52
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L52
            int r6 = r6 + 2
            int r7 = r4.length()     // Catch: java.lang.Throwable -> L52
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L52
            r7.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = ": "
            r7.append(r6)     // Catch: java.lang.Throwable -> L52
            r7.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L52
            ai.d53 r5 = new ai.d53     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L8c
            r0.v(r5)     // Catch: java.lang.Throwable -> L8c
            r1.cancel(r3)
            return
        L83:
            ai.d53 r6 = new ai.d53     // Catch: java.lang.Throwable -> L8c
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L8c
            r0.v(r6)     // Catch: java.lang.Throwable -> L8c
            throw r4     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            r1.cancel(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.b53.run():void");
    }
}
