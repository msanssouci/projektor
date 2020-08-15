/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import projektor.database.generated.tables.CodeCoverageGroup;
import projektor.database.generated.tables.CodeCoverageRun;
import projektor.database.generated.tables.CodeCoverageStats;
import projektor.database.generated.tables.ResultsProcessing;
import projektor.database.generated.tables.ResultsProcessingFailure;
import projektor.database.generated.tables.TestCase;
import projektor.database.generated.tables.TestFailure;
import projektor.database.generated.tables.TestRun;
import projektor.database.generated.tables.TestRunAttachment;
import projektor.database.generated.tables.TestRunSystemAttributes;
import projektor.database.generated.tables.TestSuite;
import projektor.database.generated.tables.TestSuiteGroup;
import projektor.database.generated.tables.records.CodeCoverageGroupRecord;
import projektor.database.generated.tables.records.CodeCoverageRunRecord;
import projektor.database.generated.tables.records.CodeCoverageStatsRecord;
import projektor.database.generated.tables.records.ResultsProcessingFailureRecord;
import projektor.database.generated.tables.records.ResultsProcessingRecord;
import projektor.database.generated.tables.records.TestCaseRecord;
import projektor.database.generated.tables.records.TestFailureRecord;
import projektor.database.generated.tables.records.TestRunAttachmentRecord;
import projektor.database.generated.tables.records.TestRunRecord;
import projektor.database.generated.tables.records.TestRunSystemAttributesRecord;
import projektor.database.generated.tables.records.TestSuiteGroupRecord;
import projektor.database.generated.tables.records.TestSuiteRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CodeCoverageGroupRecord, Long> IDENTITY_CODE_COVERAGE_GROUP = Identities0.IDENTITY_CODE_COVERAGE_GROUP;
    public static final Identity<CodeCoverageRunRecord, Long> IDENTITY_CODE_COVERAGE_RUN = Identities0.IDENTITY_CODE_COVERAGE_RUN;
    public static final Identity<CodeCoverageStatsRecord, Long> IDENTITY_CODE_COVERAGE_STATS = Identities0.IDENTITY_CODE_COVERAGE_STATS;
    public static final Identity<TestCaseRecord, Long> IDENTITY_TEST_CASE = Identities0.IDENTITY_TEST_CASE;
    public static final Identity<TestFailureRecord, Long> IDENTITY_TEST_FAILURE = Identities0.IDENTITY_TEST_FAILURE;
    public static final Identity<TestRunRecord, Long> IDENTITY_TEST_RUN = Identities0.IDENTITY_TEST_RUN;
    public static final Identity<TestRunAttachmentRecord, Long> IDENTITY_TEST_RUN_ATTACHMENT = Identities0.IDENTITY_TEST_RUN_ATTACHMENT;
    public static final Identity<TestSuiteRecord, Long> IDENTITY_TEST_SUITE = Identities0.IDENTITY_TEST_SUITE;
    public static final Identity<TestSuiteGroupRecord, Long> IDENTITY_TEST_SUITE_GROUP = Identities0.IDENTITY_TEST_SUITE_GROUP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CodeCoverageGroupRecord> CODE_COVERAGE_GROUP_PKEY = UniqueKeys0.CODE_COVERAGE_GROUP_PKEY;
    public static final UniqueKey<CodeCoverageRunRecord> CODE_COVERAGE_RUN_PKEY = UniqueKeys0.CODE_COVERAGE_RUN_PKEY;
    public static final UniqueKey<CodeCoverageStatsRecord> CODE_COVERAGE_STATS_PKEY = UniqueKeys0.CODE_COVERAGE_STATS_PKEY;
    public static final UniqueKey<ResultsProcessingRecord> RESULTS_PROCESSING_PKEY = UniqueKeys0.RESULTS_PROCESSING_PKEY;
    public static final UniqueKey<ResultsProcessingFailureRecord> RESULTS_PROCESSING_FAILURE_PKEY = UniqueKeys0.RESULTS_PROCESSING_FAILURE_PKEY;
    public static final UniqueKey<TestCaseRecord> TEST_CASE_PKEY = UniqueKeys0.TEST_CASE_PKEY;
    public static final UniqueKey<TestFailureRecord> TEST_FAILURE_PKEY = UniqueKeys0.TEST_FAILURE_PKEY;
    public static final UniqueKey<TestRunRecord> TEST_RUN_PKEY = UniqueKeys0.TEST_RUN_PKEY;
    public static final UniqueKey<TestRunRecord> TEST_RUN_PUBLIC_ID_KEY = UniqueKeys0.TEST_RUN_PUBLIC_ID_KEY;
    public static final UniqueKey<TestRunAttachmentRecord> TEST_RUN_ATTACHMENT_PKEY = UniqueKeys0.TEST_RUN_ATTACHMENT_PKEY;
    public static final UniqueKey<TestRunSystemAttributesRecord> TEST_RUN_SYSTEM_ATTRIBUTES_PKEY = UniqueKeys0.TEST_RUN_SYSTEM_ATTRIBUTES_PKEY;
    public static final UniqueKey<TestSuiteRecord> TEST_SUITE_PKEY = UniqueKeys0.TEST_SUITE_PKEY;
    public static final UniqueKey<TestSuiteGroupRecord> TEST_SUITE_GROUP_PKEY = UniqueKeys0.TEST_SUITE_GROUP_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageRunRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY = ForeignKeys0.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY;
    public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageStatsRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY = ForeignKeys0.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY;
    public static final ForeignKey<CodeCoverageRunRecord, TestRunRecord> CODE_COVERAGE_RUN__CODE_COVERAGE_RUN_TEST_RUN_ID_FKEY = ForeignKeys0.CODE_COVERAGE_RUN__CODE_COVERAGE_RUN_TEST_RUN_ID_FKEY;
    public static final ForeignKey<CodeCoverageStatsRecord, CodeCoverageRunRecord> CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY = ForeignKeys0.CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY;
    public static final ForeignKey<ResultsProcessingFailureRecord, ResultsProcessingRecord> RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY = ForeignKeys0.RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY;
    public static final ForeignKey<TestCaseRecord, TestSuiteRecord> TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY = ForeignKeys0.TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY;
    public static final ForeignKey<TestFailureRecord, TestCaseRecord> TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY = ForeignKeys0.TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY;
    public static final ForeignKey<TestRunSystemAttributesRecord, TestRunRecord> TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY = ForeignKeys0.TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY;
    public static final ForeignKey<TestSuiteRecord, TestRunRecord> TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY = ForeignKeys0.TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY;
    public static final ForeignKey<TestSuiteRecord, TestSuiteGroupRecord> TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY = ForeignKeys0.TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY;
    public static final ForeignKey<TestSuiteGroupRecord, TestRunRecord> TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY = ForeignKeys0.TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CodeCoverageGroupRecord, Long> IDENTITY_CODE_COVERAGE_GROUP = Internal.createIdentity(CodeCoverageGroup.CODE_COVERAGE_GROUP, CodeCoverageGroup.CODE_COVERAGE_GROUP.ID);
        public static Identity<CodeCoverageRunRecord, Long> IDENTITY_CODE_COVERAGE_RUN = Internal.createIdentity(CodeCoverageRun.CODE_COVERAGE_RUN, CodeCoverageRun.CODE_COVERAGE_RUN.ID);
        public static Identity<CodeCoverageStatsRecord, Long> IDENTITY_CODE_COVERAGE_STATS = Internal.createIdentity(CodeCoverageStats.CODE_COVERAGE_STATS, CodeCoverageStats.CODE_COVERAGE_STATS.ID);
        public static Identity<TestCaseRecord, Long> IDENTITY_TEST_CASE = Internal.createIdentity(TestCase.TEST_CASE, TestCase.TEST_CASE.ID);
        public static Identity<TestFailureRecord, Long> IDENTITY_TEST_FAILURE = Internal.createIdentity(TestFailure.TEST_FAILURE, TestFailure.TEST_FAILURE.ID);
        public static Identity<TestRunRecord, Long> IDENTITY_TEST_RUN = Internal.createIdentity(TestRun.TEST_RUN, TestRun.TEST_RUN.ID);
        public static Identity<TestRunAttachmentRecord, Long> IDENTITY_TEST_RUN_ATTACHMENT = Internal.createIdentity(TestRunAttachment.TEST_RUN_ATTACHMENT, TestRunAttachment.TEST_RUN_ATTACHMENT.ID);
        public static Identity<TestSuiteRecord, Long> IDENTITY_TEST_SUITE = Internal.createIdentity(TestSuite.TEST_SUITE, TestSuite.TEST_SUITE.ID);
        public static Identity<TestSuiteGroupRecord, Long> IDENTITY_TEST_SUITE_GROUP = Internal.createIdentity(TestSuiteGroup.TEST_SUITE_GROUP, TestSuiteGroup.TEST_SUITE_GROUP.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CodeCoverageGroupRecord> CODE_COVERAGE_GROUP_PKEY = Internal.createUniqueKey(CodeCoverageGroup.CODE_COVERAGE_GROUP, "code_coverage_group_pkey", new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.ID }, true);
        public static final UniqueKey<CodeCoverageRunRecord> CODE_COVERAGE_RUN_PKEY = Internal.createUniqueKey(CodeCoverageRun.CODE_COVERAGE_RUN, "code_coverage_run_pkey", new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.ID }, true);
        public static final UniqueKey<CodeCoverageStatsRecord> CODE_COVERAGE_STATS_PKEY = Internal.createUniqueKey(CodeCoverageStats.CODE_COVERAGE_STATS, "code_coverage_stats_pkey", new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.ID }, true);
        public static final UniqueKey<ResultsProcessingRecord> RESULTS_PROCESSING_PKEY = Internal.createUniqueKey(ResultsProcessing.RESULTS_PROCESSING, "results_processing_pkey", new TableField[] { ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID }, true);
        public static final UniqueKey<ResultsProcessingFailureRecord> RESULTS_PROCESSING_FAILURE_PKEY = Internal.createUniqueKey(ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE, "results_processing_failure_pkey", new TableField[] { ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.PUBLIC_ID }, true);
        public static final UniqueKey<TestCaseRecord> TEST_CASE_PKEY = Internal.createUniqueKey(TestCase.TEST_CASE, "test_case_pkey", new TableField[] { TestCase.TEST_CASE.ID }, true);
        public static final UniqueKey<TestFailureRecord> TEST_FAILURE_PKEY = Internal.createUniqueKey(TestFailure.TEST_FAILURE, "test_failure_pkey", new TableField[] { TestFailure.TEST_FAILURE.ID }, true);
        public static final UniqueKey<TestRunRecord> TEST_RUN_PKEY = Internal.createUniqueKey(TestRun.TEST_RUN, "test_run_pkey", new TableField[] { TestRun.TEST_RUN.ID }, true);
        public static final UniqueKey<TestRunRecord> TEST_RUN_PUBLIC_ID_KEY = Internal.createUniqueKey(TestRun.TEST_RUN, "test_run_public_id_key", new TableField[] { TestRun.TEST_RUN.PUBLIC_ID }, true);
        public static final UniqueKey<TestRunAttachmentRecord> TEST_RUN_ATTACHMENT_PKEY = Internal.createUniqueKey(TestRunAttachment.TEST_RUN_ATTACHMENT, "test_run_attachment_pkey", new TableField[] { TestRunAttachment.TEST_RUN_ATTACHMENT.ID }, true);
        public static final UniqueKey<TestRunSystemAttributesRecord> TEST_RUN_SYSTEM_ATTRIBUTES_PKEY = Internal.createUniqueKey(TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES, "test_run_system_attributes_pkey", new TableField[] { TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES.TEST_RUN_PUBLIC_ID }, true);
        public static final UniqueKey<TestSuiteRecord> TEST_SUITE_PKEY = Internal.createUniqueKey(TestSuite.TEST_SUITE, "test_suite_pkey", new TableField[] { TestSuite.TEST_SUITE.ID }, true);
        public static final UniqueKey<TestSuiteGroupRecord> TEST_SUITE_GROUP_PKEY = Internal.createUniqueKey(TestSuiteGroup.TEST_SUITE_GROUP, "test_suite_group_pkey", new TableField[] { TestSuiteGroup.TEST_SUITE_GROUP.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageRunRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY = Internal.createForeignKey(Keys.CODE_COVERAGE_RUN_PKEY, CodeCoverageGroup.CODE_COVERAGE_GROUP, "code_coverage_group_code_coverage_run_id_fkey", new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.CODE_COVERAGE_RUN_ID }, true);
        public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageStatsRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY = Internal.createForeignKey(Keys.CODE_COVERAGE_STATS_PKEY, CodeCoverageGroup.CODE_COVERAGE_GROUP, "code_coverage_group_stats_id_fkey", new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.STATS_ID }, true);
        public static final ForeignKey<CodeCoverageRunRecord, TestRunRecord> CODE_COVERAGE_RUN__CODE_COVERAGE_RUN_TEST_RUN_ID_FKEY = Internal.createForeignKey(Keys.TEST_RUN_PKEY, CodeCoverageRun.CODE_COVERAGE_RUN, "code_coverage_run_test_run_id_fkey", new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.TEST_RUN_ID }, true);
        public static final ForeignKey<CodeCoverageStatsRecord, CodeCoverageRunRecord> CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY = Internal.createForeignKey(Keys.CODE_COVERAGE_RUN_PKEY, CodeCoverageStats.CODE_COVERAGE_STATS, "code_coverage_stats_code_coverage_run_id_fkey", new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.CODE_COVERAGE_RUN_ID }, true);
        public static final ForeignKey<ResultsProcessingFailureRecord, ResultsProcessingRecord> RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY = Internal.createForeignKey(Keys.RESULTS_PROCESSING_PKEY, ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE, "results_processing_failure_public_id_fkey", new TableField[] { ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.PUBLIC_ID }, true);
        public static final ForeignKey<TestCaseRecord, TestSuiteRecord> TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY = Internal.createForeignKey(Keys.TEST_SUITE_PKEY, TestCase.TEST_CASE, "test_case_test_suite_id_fkey", new TableField[] { TestCase.TEST_CASE.TEST_SUITE_ID }, true);
        public static final ForeignKey<TestFailureRecord, TestCaseRecord> TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY = Internal.createForeignKey(Keys.TEST_CASE_PKEY, TestFailure.TEST_FAILURE, "test_failure_test_case_id_fkey", new TableField[] { TestFailure.TEST_FAILURE.TEST_CASE_ID }, true);
        public static final ForeignKey<TestRunSystemAttributesRecord, TestRunRecord> TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY = Internal.createForeignKey(Keys.TEST_RUN_PUBLIC_ID_KEY, TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES, "test_run_system_attributes_test_run_public_id_fkey", new TableField[] { TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES.TEST_RUN_PUBLIC_ID }, true);
        public static final ForeignKey<TestSuiteRecord, TestRunRecord> TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY = Internal.createForeignKey(Keys.TEST_RUN_PKEY, TestSuite.TEST_SUITE, "test_suite_test_run_id_fkey", new TableField[] { TestSuite.TEST_SUITE.TEST_RUN_ID }, true);
        public static final ForeignKey<TestSuiteRecord, TestSuiteGroupRecord> TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY = Internal.createForeignKey(Keys.TEST_SUITE_GROUP_PKEY, TestSuite.TEST_SUITE, "test_suite_test_suite_group_id_fkey", new TableField[] { TestSuite.TEST_SUITE.TEST_SUITE_GROUP_ID }, true);
        public static final ForeignKey<TestSuiteGroupRecord, TestRunRecord> TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY = Internal.createForeignKey(Keys.TEST_RUN_PKEY, TestSuiteGroup.TEST_SUITE_GROUP, "test_suite_group_test_run_id_fkey", new TableField[] { TestSuiteGroup.TEST_SUITE_GROUP.TEST_RUN_ID }, true);
    }
}
