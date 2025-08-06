UsageStatsManager usm = (UsageStatsManager) context.getSystemService("usagestats");
long now = System.currentTimeMillis();
List<UsageStats> stats = usm.queryUsageStats(UsageStatsManager.INTERVAL_DAILY, startTime, now);
