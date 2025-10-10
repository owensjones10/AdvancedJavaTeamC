CONNECT 'jdbc:derby://localhost:1527/tpchdb;user=app;password=app';

-- Absolute file paths for Owen's local machine
-- Other teammates: update the path to match where you cloned the repo
CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE(
    NULL, 'PART',
    '/Users/owenjones/Documents/AdvancedJavaTeamC/db/tpch_data/part.tbl',
    '|', NULL, 'UTF-8', 0
);

CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE(
    NULL, 'PARTSUPP',
    '/Users/owenjones/Documents/AdvancedJavaTeamC/db/tpch_data/partsupp.tbl',
    '|', NULL, 'UTF-8', 0
);

CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE(
    NULL, 'CUSTOMER',
    '/Users/owenjones/Documents/AdvancedJavaTeamC/db/tpch_data/customer.tbl',
    '|', NULL, 'UTF-8', 0
);

CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE(
    NULL, 'ORDERS',
    '/Users/owenjones/Documents/AdvancedJavaTeamC/db/tpch_data/orders.tbl',
    '|', NULL, 'UTF-8', 0
);
