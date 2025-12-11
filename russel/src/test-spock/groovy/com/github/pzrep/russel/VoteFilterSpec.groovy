package com.github.pzrep.russel

import spock.lang.Specification

class VoteFilterSpec extends Specification {
    private final VoteFilter filter = []

    def "votes"() {
        expect:
        filter.accept(vote) == accepted

        where:
        vote | accepted
        0    | false
        1    | true
        7    | false
        9    | true
    }
}
