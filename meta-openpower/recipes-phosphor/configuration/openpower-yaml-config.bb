SUMMARY = "Shared OpenPOWER configuration"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${OPENPOWERBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"

inherit allarch

SRC_URI = " \
    file://ipmi-fru-properties-mrw.yaml \
    file://ipmi-hostboot-fru-mrw.yaml \
    file://ipmi-hostboot-volatile-sensor-mrw.yaml \
    file://ipmi-occ-active-sensor-mrw.yaml \
    "

S = "${WORKDIR}"

do_install() {
    install -m 0644 -D ipmi-fru-properties-mrw.yaml \
        ${D}${datadir}/${BPN}/ipmi-fru-properties-mrw.yaml
    install -m 0644 -D ipmi-hostboot-fru-mrw.yaml \
        ${D}${datadir}/${BPN}/ipmi-hostboot-fru-mrw.yaml
    install -m 0644 -D ipmi-hostboot-volatile-sensor-mrw.yaml \
        ${D}${datadir}/${BPN}/ipmi-hostboot-volatile-sensor-mrw.yaml
    install -m 0644 -D ipmi-occ-active-sensor-mrw.yaml \
        ${D}${datadir}/${BPN}/ipmi-occ-active-sensor-mrw.yaml
}

FILES_${PN}-dev = " \
    ${datadir}/${BPN}/ipmi-fru-properties-mrw.yaml \
    ${datadir}/${BPN}/ipmi-hostboot-fru-mrw.yaml \
    ${datadir}/${BPN}/ipmi-hostboot-volatile-sensor-mrw.yaml \
    ${datadir}/${BPN}/ipmi-occ-active-sensor-mrw.yaml \
    "

ALLOW_EMPTY_${PN} = "1"
