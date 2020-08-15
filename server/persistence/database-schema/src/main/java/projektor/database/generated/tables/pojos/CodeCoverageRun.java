/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageRun implements Serializable {

    private static final long serialVersionUID = 349007146;

    private Long   id;
    private Long   testRunId;
    private String testRunPublicId;

    public CodeCoverageRun() {}

    public CodeCoverageRun(CodeCoverageRun value) {
        this.id = value.id;
        this.testRunId = value.testRunId;
        this.testRunPublicId = value.testRunPublicId;
    }

    public CodeCoverageRun(
        Long   id,
        Long   testRunId,
        String testRunPublicId
    ) {
        this.id = id;
        this.testRunId = testRunId;
        this.testRunPublicId = testRunPublicId;
    }

    public Long getId() {
        return this.id;
    }

    public CodeCoverageRun setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTestRunId() {
        return this.testRunId;
    }

    public CodeCoverageRun setTestRunId(Long testRunId) {
        this.testRunId = testRunId;
        return this;
    }

    public String getTestRunPublicId() {
        return this.testRunPublicId;
    }

    public CodeCoverageRun setTestRunPublicId(String testRunPublicId) {
        this.testRunPublicId = testRunPublicId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CodeCoverageRun other = (CodeCoverageRun) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (testRunId == null) {
            if (other.testRunId != null)
                return false;
        }
        else if (!testRunId.equals(other.testRunId))
            return false;
        if (testRunPublicId == null) {
            if (other.testRunPublicId != null)
                return false;
        }
        else if (!testRunPublicId.equals(other.testRunPublicId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.testRunId == null) ? 0 : this.testRunId.hashCode());
        result = prime * result + ((this.testRunPublicId == null) ? 0 : this.testRunPublicId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CodeCoverageRun (");

        sb.append(id);
        sb.append(", ").append(testRunId);
        sb.append(", ").append(testRunPublicId);

        sb.append(")");
        return sb.toString();
    }
}
