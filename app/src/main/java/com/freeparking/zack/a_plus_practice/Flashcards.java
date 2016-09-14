package com.freeparking.zack.a_plus_practice;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Flashcards {

    public String[][] biosFlashcards = {
            {"Diagnostic sequence that checks proper functionality of necessary devices upon startup.",
                    "POST - Power On Self Test"},
            {"The order of priority in which your PC will check for boot-able media.",
                    "Boot Sequence"},
            {"The original BIOS without drivers for modern network, video, and storage devices.",
                    "Legacy BIOS"},
            {"Replaced the Legacy BIOS.  Can boot from large HDDs.  Often has a graphical interface.",
                    "UEFI - Unified Extensible Firmware Interface"},
            {"Designed to secure hardware by integrating cryptographic keys into devices.",
                    "TPM - Trusted Platform Module"},
            {"Boot mode that only allows users to boot from properly signed software.",
                    "Secure Boot"},
            {"Used to maintain date and time. Originally used to hold all BIOS configurations.",
                    "CMOS - Complimentary Metal-Oxide Semiconductor."},
            {"A password that can be set by a user that is stored in the BIOS. If set, it would need to be entered in order to boot the OS.",
                    "User Password"},
            {"A password that can be set by a user that is stored in the BIOS. If set, it would need to be entered in order to enter the BIOS.",
                    "Supervisor Password"},
            {"Features remote data and device security to prevent use of a lost laptop, protect privacy remotely, and map a laptop's location.",
                    "LoJack For Laptops"},
            {"What setting in the BIOS should be enabled in order to run a Virtual Machine?",
                    "Virtualization"}
    };

    public String[][] motherboardFlashcards = {
            {"Provides the physical connection between the computer's expansion bus and the network cabling.",
                    "NIC - Network Interface Controller/Card"},
            {"Keeps the time for a device and must have an alternative power source (CMOS) to use when the device is powered off.",
                    "RTC - Real Time Clock"},
            {"Set of electronic components that manage the flow of data between the core components of the motherboard, such as memory, processor, and other peripherals.",
                    "Chipset"},
            {"A device that uses laser light to read and write to an optical disc.",
                    "ODD - Optical Disc Drive"},
            {"A data storage device that uses mechanical parts.",
                    "HDD - Hard Disk Drive"},
            {"Memory that can be accessed at random.",
                    "RAM - Random Access Memory"},
            {"Firmware or Software that controls input and output functions",
                    "BIOS - Basic Input/Output System"},
            {"The brains of the computer where most calculations take place.",
                    "CPU - Central Processing Unit"},
            {"Motherboard size/form factor, standardized by Intel 1995. Still popular today.",
                    "ATX - Advanced Technology Extended"},
            {"Small motherboard form factor with similar mounting points to ATX.",
                    "microATX"},
            {"Smaller than microATX, designed for single purpose computers.",
                    "Mini-ITX"},
            {"Legacy expansion slots. Speeds from 133 MB/s to 533 MB/s.",
                    "PCI - Peripheral Component Interconnect"},
            {"Expansion slots designed for servers with speeds of 1,064 MB/s.",
                    "PCI-X - PCI Extended"},
            {"High performance expansion slots (x1, x2, x4, x8, x16, x32 lanes) with speeds from 250MB/s to 2 GB/s. ",
                    "PCIe - PCI Express"},
            {"PCI and PCIe for Laptops.",
                    "Mini PCI & PCI Express MiniCard"},
            {"CPU chipset bridge that manages the connection between the CPU and memory. High speed.",
                    "Northbridge"},
            {"CPU chipset bridge that contains the BIOS.  Manages USB, Ethernet, SATA, etc. Slower speeds.",
                    "Southbridge"}
    };

    public String[][] ramFlashcards = {
            {"Small circuit board that holds RAM to the motherboard.",
                    "DIMM - Dual Inline Memory Module"},
            {"Small circuit board that holds RAM to the motherboard in laptops.",
                    "SO-DIMM - Small Outline Dual Inline Memory Module"},
            {"Small RAM form factor.  Smaller than SO-DIMM.",
                    "Micro-DIMM"},
            {"Very fast memory that maintains data without constant refreshing. Often used in CPU caches.",
                    "SRAM - Static RAM"},
            {"Memory that requires constant refreshing to maintain data.",
                    "DRAM - Dynamic RAM"},
            {"Memory that is synchronous with the system clock.",
                    "SDRAM - Synchronous Dynamic RAM"},
            {"Memory with twice the data rate of SDRAM",
                    "DDR - Double Data Rate SDRAM"},
            {"Memory with twice the bus clock multiplier of DDR.",
                    "DDR2 - Double Data Rate 2 SDRAM"},
            {"Memory with four times the bus clock multiplier of DDR.",
                    "DDR3 - Double Data Rate 3 SDRAM"},
            {"RAM that detects errors, and corrects them on the fly.",
                    "ECC Memory- Error Correcting Code Memory"},
            {"Memory that includes an additional parity bit.",
                    "Parity Memory"},
            {"Memory that includes a register between the DRAM modules and the system's memory controller. Also known as buffered memory.",
                    "Registered Memory"},
            {"Best RAM choice for a server. Very expensive, but very rarely cause errors.",
                    "ECC Memory - Error Correcting Code Memory"},
            {"Memory that is installed in pairs/trios for best performance.",
                    "Multi-Channel Memory"},

            {"How many pins does a DIMM SDR SDRAM module have?",
                    "168 pins"},
            {"How many pins does a DIMM DDR SDRAM module have?",
                    "184 pins"},
            {"How many pins does a SO-DIMM SDR SDRAM module have?",
                    "144 pins"},
            {"How many pins does a MicroDIMM DDR SDRAM module have?",
                    "172 pins"},
            {"How many pins does a SO-DIMM DDR/DDR2 SDRAM module have?",
                    "200 pins"},
            {"How many pins does a SO-DIMM DDR3 SDRAM module have?",
                    "204 pins"},
            {"How many pins does a MicroDIMM DDR2 SDRAM module have?",
                    "214 pins"},
            {"How many pins does a SO-DIMM DDR4 SDRAM module have?",
                    "260 pins"},
            {"How many pins does a DIMM DDR4 SDRAM module have?",
                    "288 pins"},

            {"What is the transfer rate of a DDR 100 MHz (DDR-200) RAM stick?",
                    "1,600 MB/s"},
            {"What is the transfer rate of a DDR 133 MHz (DDR-266) RAM stick?",
                    "2,133 MB/s"},
            {"What is the transfer rate of a DDR 166 MHz (DDR-333) RAM stick?",
                    "2,667 MB/s"},
            {"What is the transfer rate of a DDR 200 MHz (DDR-400) RAM stick?",
                    "3,200 MB/s"},

            {"What is the transfer rate of a DDR2 100 MHz (DDR2-400) RAM stick?",
                    "3,200 MB/s"},
            {"What is the transfer rate of a DDR2 133 MHz (DDR2-533) RAM stick?",
                    "4,266 MB/s"},
            {"What is the transfer rate of a DDR2 166 MHz (DDR2-667) RAM stick?",
                    "5,333 MB/s"},
            {"What is the transfer rate of a DDR2 200 MHz (DDR2-800) RAM stick?",
                    "6,400 MB/s"},
            {"What is the transfer rate of a DDR2 266 MHz (DDR2-1066) RAM stick?",
                    "8,533 MB/s"},

            {"What is the transfer rate of a DDR3 100 MHz (DDR3-800) RAM stick?",
                    "6,400 MB/s"},
            {"What is the transfer rate of a DDR3 133 MHz (DDR3-1066) RAM stick?",
                    "8,533 MB/s"},
            {"What is the transfer rate of a DDR3 167 MHz (DDR3-1333) RAM stick?",
                    "10,667 MB/s"},
            {"What is the transfer rate of a DDR3 200 MHz (DDR3-1600) RAM stick?",
                    "12,800 MB/s"},
            {"What is the transfer rate of a DDR3 233 MHz (DDR3-1866) RAM stick?",
                    "14,933 MB/s"},
            {"What is the transfer rate of a DDR3 267 MHz (DDR3-2133) RAM stick?",
                    "17,066 MB/s"},
    };

    public String[][] storageFlashcards = {
            {"System memory that can not be changed or erased.",
                    "ROM - Read Only Memory"},
            {"System memory that can only be programmed once.",
                    "PROM - Programmable Read Only Memory"},
            {"System memory that can be erased using UV light, and reprogrammed.",
                    "EPROM - Eraseable PROM"},
            {"System memory that can be flashed. Easily reprogrammable.",
                    "EEPROM - Electrically Eraseable PROM"},
            {"True or False.  Magnetic tape can store a maximum of 38GB.",
                    "False. Magnetic tape can store up to several TB of data."},
            {"CD/DVD type that can be written to, erased, and rewritten to.",
                    "RW - ReWritable"},
            {"Blu-ray disc type that can only be written to once.",
                    "BD-R - Blu-ray Disc recordable"},
            {"Blu-ray disc that can be written to, erased, and then rewritten to.",
                    "BD-RE - Blu-ray Disc Recordable Erasable "},
            {"Maximum storage capacity of a single-layer Blu-ray disc.",
                    "25 GB"},
            {"Maximum capacity of a dual-layer Blu-ray disc.",
                    "50 GB"},
            {"Maximum storage capacity of a CD",
                    "700 MB"},
            {"Maximum capacity of a single layer DVD.",
                    "4.7 GB"},
            {"Maximum capacity of a dual layer DVD.",
                    "8.5 GB"},
            {"Term for the delay from input into a system to desired outcome",
                    "Latency"},
            {"What does RAID stand for?",
                    "Redundant Array of Independent (or Inexpensive) Disks"},
            {"RAID format that requires at least 2 drives. If one disk fails, all data is lost.  Known as Striping.",
                    "RAID 0"},
            {"RAID format that requires at least 2 drives. If one disk fails, data is maintained. Known as mirroring.",
                    "RAID 1"},
            {"RAID format that requires at least 3 drives.  Includes a parity block of data.",
                    "RAID 5"},
            {"RAID format that requires at least 4 drives.  A combination of mirroring and striping.",
                    "RAID 1+0"},
            {"RAID format in which data can be maintained if all drives are operational but one.",
                    "RAID 5"},
            {"RAID format in which data can be maintained if all but one drive from each set of mirrors have failed.",
                    "RAID 1+0"},
            {"5400 rpm, 7200 rpm, and 10,000 rpm are common speeds of what?",
                    "Hard Disk Drives"},
            {"What storage formats are hot-swappable?",
                    "USB, FireWire, SATA, eSATA"},
            {"Average latency of a 10,000 rpm disk drive.",
                    "3ms"},
            {"Average latency of a 7200 rpm disk drive.",
                    "4.16ms"},
            {"Average latency of a 5400 rpm disk drive.",
                    "5.55ms"}
    };

    public String[][] printerFlashcards = {
            {"Printer that uses heat and pressure to melt toner pellets on to the page.",
                    "Laser Printer"},
            {"Printer that uses very fine drops of ink.",
                    "Inkjet Printer"},
            {"Printer that applies heat to special paper.",
                    "Thermal Printer"},
            {"Printer that uses a printer head that strikes a ribbon and the paper.",
                    "Impact printer."},
            {"Standard measurement used for printer resolution.",
                    "DPI - Dots Per Inch"},
            {"Software that temporarily stores print jobs on the computer hard disk or in memory until the printer is ready to print them.",
                    "Printer Spooler"},
            {"The prints from your laser printer are becoming increasingly faded.  What is more than likely the cause?",
                    "Need to replace toner cartridges."},
            {"The output from your impact printer is fading.  What should be replaced?",
                    "Printer ribbon."},
            {"Digital print format built into most browsers.",
                    "PDF"},
            {"Printer that has many moving parts, and requires memory, and high voltages.",
                    "Laser printer."},
            {"Printer that clogs easily, and uses proprietary ink.",
                    "Inkjet printer"},
            {"What type of printer's image begins to fade rapidly?",
                    "Thermal printer"},
            {"Noisy printer, and output graphics are typically of a poor quality.",
                    "Impact printer"},
    };

    public String[][] networkingFlashcards = {
            {"802.11 specification that uses a 5GHz frequency, and has a max throughput of 54Mbit/s.",
                    "802.11a"},
            {"802.11a's outdoor range.",
                    "120 meters."},
            {"802.11 specification that uses a 2.4GHz frequency, and has a max throughput of 11Mbit/s.",
                    "802.11b"},
            {"802.11b's outdoor range.",
                    "140 meters."},
            {"802.11 specification that uses a 2.4GHz frequency, and has a max throughput of 54 Mbit/s.",
                    "802.11g"},
            {"802.11g's outdoor range.",
                    "140 meters."},
            {"802.11 specification that has either 5GHz or 2.4GHz, and has a max throughput of 150 Mbit/s per stream.",
                    "802.11n"},
            {"802.11n's outdoor range.",
                    "250 meters."},
            {"802.11 specification that uses a frequency of 5GHz, and has a max throughput of 6,934 Mbit/s.",
                    "802.11ac"},
            {"802.11ac's outdoor range.",
                    "250 meters"},
            {"Wireless Encryption Standard that uses a 64/128 bit key.  Very vulnerable.",
                    "WEP"},
            {"Wireless Encryption Standard that was used as a short-term work-around for WEP.",
                    "WPA"},
            {"Latest and most secure Wireless Encryption Standard.",
                    "WPA2"},
            {"Network type that would be best used for a single building.",
                    "LAN - Land Area Network"},
            {"The internet is a good example of what network type?",
                    "WAN - Wide Area Network"},
            {"Network type that would be best used in a car.",
                    "PAN - Personal Area Network"},
            {"Networking type that would be best used to connect many banks in a single city.",
                    "MAN - Metropolitan Area Network"},
            {"Software or hardware that filters internet traffic by IP, port number, or application.",
                    "Firewall"},
            {"Device that forwards internet traffic based on a data link address.  Bridging is done in hardware.",
                    "Switch"},
            {"Network device that converts analog to digital.",
                    "Modem"},
            {"Network device that bridges wired signals to wireless.",
                    "WAP - Wireless Access Point"},
            {"Network device that routes traffic between IP subnets.",
                    "Router"},
            {"Network tool that pinches the connector to a wire.",
                    "Crimper"},
            {"Network tool that measures voltage, current and resistance.",
                    "Multimeter"},
            {"Network tool used to find a specific wire.",
                    "Tone generator and probe"},
            {"A network tool used to test the quality of a cable connection.",
                    "Cable tester"},
            {"Network tool used to ensure that data is properly reaching it's destination through the cable.",
                    "Loopback plug"},
            {"A network tool that trims wires, and forces them into a wiring block.",
                    "Punchdown tool"},
            {"A network tool that tests WiFi signals, and identifies interference.",
                    "WiFi Analyzer"},
            {"A network tool that removes insulation from copper wiring.",
                    "Cable stripper"},
            {"Method that allows Ethernet to provide data and power to a device.",
                    "PoE - Power Over Ethernet"},
            {"Transfer rate of 500Mbit/s and is marketed as Ethernet over Power.",
                    "PLC - Power Line Communication"},
            {"A network device that transmits packets to every port.",
                    "Hub"},
            {"Internet connection type that utilizes visual space between two antennas.",
                    "Line-of-sight network"},
            {"Fastest, but more expensive internet connection type.",
                    "Fiber"},
            {"Internet connection that uses phone lines while keeping the telephone line open.",
                    "DSL"},
            {"Internet connection that uses a coaxial connection. Very common today.",
                    "Cable internet"},
            {"TCP - 20/21",
                    "FTP - File Transfer Protocol. Sends and receives files between systems."},
            {"TCP - 22",
                    "SSH - Secure Shell. Encrypted console access."},
            {"TCP - 23",
                    "Telnet - Telecommunication Network. Insecure console access."},
            {"TCP - 25",
                    "SMTP - Simple Mail Transfer Protocol.  Transfer email between mail servers."},
            {"TCP/UDP - 53",
                    "DNS - Domain Name Service.  Convert domain names to IP addresses."},
            {"TCP - 80",
                    "HTTP - Hypertext Transfer Protocol.  Web server communication."},
            {"TCP - 110",
                    "POP3 - Post Office Protocol v3.  Receive email into an email client."},
            {"TCP 143",
                    "IMAP4 - Internet Message Access Protocol v4. A newer email client protocol."},
            {"TCP - 443",
                    "HTTPS - Hypertext Transfer Protocol Secure.  Web server communication with encryption."},
            {"TCP - 3389",
                    "RDP - Remote Desktop Protocol.  Graphical display of remote devices."},
            {"UDP - 137",
                    "NetBIOS Name Service. Register, remove, and find Windows services by name."},
            {"UDP - 138",
                    "NetBIOS Datagram Service.  Windows connectionless data transfers."},
            {"TCP - 139",
                    "NetBIOS Session Service.  Windows connection-oriented data transfer."},
            {"TCP/UDP - 427",
                    "SLP - Service Location Protocol.  Find Mac OS services by name."},
            {"TCP - 445",
                    "SMB - Server Message Block.  Windows file transfers and printer sharing."},
            {"TCP - 548",
                    "AFP - Apple Filing Protocol.  Mac OS file transfers."},
            {"UDP - 67/68",
                    "DHCP - Dynamic Host Configuration Protocol.  Automate the IP address configuration process."},
            {"TCP/UDP - 389",
                    "LDAP - Lightweight Directory Access Protocol.  Directory services protocol."},
            {"UDP - 161",
                    "SNMP - Simple Network Management Protocol.  Gather metrics and manage network devices."},
    };

    public String[][] miscFlashcards = {
            {"Software licensing and delivery model in which software is licensed on a subscription basis and is centrally hosted. It is sometimes referred to as on-demand software",
                    "SaaS - Software as a Service"},
            {"Lightweight, low-power display.  Requires a separate backlight.",
                    "LCD - Liquid Crystal Display"},
            {"Display that is easier on eyes, and has excellent color quality.",
                    "IPS - In Plane Switching"},
            {"Display that requires no glass, and uses an organic compound to provide light.",
                    "OLED - Organic Light Emitting Diode"},
            {"Low power display with very fast response times.  Commonly has poor viewing angles, and color shifts.",
                    "TN - Twisted Nematic"},
            {"Display that uses an LED backlight rather than florescent.",
                    "LED-backlit LCD"},
            {"Backlight that uses high voltage, and high power consumption.",
                    "CCFL - Cold Cathode Fluorescent Lamp"},
            {"Special key that allows you to access extra options, typically on laptops in addition to the F keys.",
                    "Fn keys - Function keys"},
            {"A client complains that their WiFi will sometimes stop working after their cat walks on their laptop keyboard. What is more than likely the solution?",
                    "The cat is pressing the WiFi key."},
            {"A client has issues seeing their keyboard keys at night, what peripheral would be the best solution?",
                    "A backlit keyboard."},
            {"A client is unable to use their touchpad suddenly.  What should be the first thing you check.",
                    "Check if the touchpad has been disabled."},
            {"A small piece of hardware that can give off location information.",
                    "GPS"},
            {"A client complains that their battery doesn't last as long as they'd like, as well as their eyes being uncomfortable while browsing the internet. What is the best solution?",
                    "Adjust the screen brightness."},
            {"A client lives in an area far away from ISP coverage.  Client does not care about price or internet speed.  What internet service option should they pursue?",
                    "Satellite Internet"},
            {"Legacy internet type that uses telephone lines.",
                    "Dial-up"},
            {"What sort of expansion card would you need to increase the amount of expansion slots in your PC?",
                    "Riser Card"},
            {"If your desktop comes without built-in WiFi capabilities, what internal component is easy to add to gain WiFi access?",
                    "Network Card"},
            {"You've just installed a new sound card, but you're not producing any audio.  What is more than likely the issue?",
                    "You need to install the sound card's drivers"},
            {"The sudden flow of electricity between two electrically charged objects caused by contact, an electrical short, or dielectric breakdown.",
                    "ESD - Electrostatic Discharge"},
            {"Windows command used to add, remove, and/or list volumes/partitions.",
                    "DISKPART"},
            {"Windows command used to scan for and fix disk errors.",
                    "CHKDSK /f"},
            {"Windows command used to locate and recover from bad sectors of a HDD.",
                    "CHKDSK /r"},
            {"What can you do to a HDD to wipe it clean and create a new filesystem?",
                    "Format"},
            {"If important files are deleted, what process can be done to possibly retrieve the data?",
                    "File/data recovery."},
            {"The process of concatenating parts stored in separate locations on a disk.",
                    "Defragmenting"},
    };

    public String[][] cableAndTransferFlashcards = {
            {"The ability to add or remove a component without causing an interruption or powering off a system.",
                    "Hot swapping"},
            {"Technology utilized by Apple/Android pay.  Allows for communication of devices at very small distances apart.",
                    "NFC - Near Field Communication"},
            {"Max amount of USB ports a computer can support.",
                    "127 ports"},
            {"Max length of a USB 2.0 cable.",
                    "5 meters"},
            {"Max length of a USB 3.0 cable.",
                    "3 meters"},
            {"Cable that has a cable length max of 15 feet(4.5 meters), but can be daisy chained up to 72 meters.",
                    "FireWire 400"},
            {"Cable that supports up to 100 meters max in length on optical connections.",
                    "FireWire 800"},
            {"Max length of a VGA cable.",
                    "10 meters"},
            {"DVI doesn't have a specified max length, however has a max length of how many feet in order to produce 1080p video?",
                    "15 feet"},
            {"IrDA - Infrared Data Association has a maximum line of sight of how many meters?",
                    "1 meter"},
            {"Max length of a SATA cable.",
                    "1 meter"},
            {"Max length of an eSATA cable.",
                    "2 meters"},
            {"Max length of a copper Thunderbolt cable.",
                    "3 meters"},
            {"Max length of an optical Thunderbolt cable.",
                    "60 meters"},
            {"USB 1.1 Low Speed's maximum transfer rate.",
                    "1.5 Mbit/s"},
            {"USB 1.1 Full speed's maximum transfer rate.",
                    "12 Mbit/s"},
            {"USB 2.0 maximum transfer rate.",
                    "480 Mbit/s"},
            {"USB 3.0 maximum transfer rate.",
                    "4.8 Gbit/s"},
            {"FireWire 400 maximum transfer rate.",
                    "400 Mbit/s"},
            {"FireWire 800 maximum transfer rate.",
                    "800Mbit/s"},
            {"IrDA - Infrared Data Association maximum transfer rate.",
                    "4 Mbit/s"},
            {"What cable supports a max speed of 10 Gbit/s per channel, and 20 Gbit/s thoughout?",
                    "Thunderbold v1"},
            {"Max transfer rate supported by Thunderbolt v2.",
                    "20 Gbit/s"},
            {"Max speed supported by Thunderbolt v3.",
                    "40 Gbit/s"},
            {"Max speed of SATA revisions 1.0, 2.0, and 3.0 in order.",
                    "1.5 Gbit/s, 3.0 Gbit/s, 6.0 Gbit/s"},
            {"Bluetooth version 1.2 data rate.",
                    "1 Mbit/s"},
            {"Bluetooth version 2.0 + EDR data rate.",
                    "3 Mbit/s"},
            {"Bluetooth version 3.0 + HS data rate.",
                    "24 Mbit/s"},
            {"Bluetooth version 4.0 data rate.",
                    "24 Mbit/s"},
    };

    public String[][] cpuFlashcards = {
            {"A technology used by some Intel microprocessors that allows a single microprocessor to act like two separate processors to the operating system and the application programs that use it.",
                    "Hyper-Threading"},
            {"Can a 64-bit CPU be used with both 32-bit and 64-bit version of the Microsoft Windows operating system?",
                    "Yes"},
            {"A technology used in CPUs to segregate areas of memory for use by either storage of processor instructions or for storage of data. Used for security purposes.",
                    "NX Bit/No-eXecute"},
            {"CPU socket that requires very little force to insert.",
                    "ZIF - Zero Insertion Force"},
            {"CPU socket in which the pins are on the CPU.",
                    "PGA - Pin Grid Array"},
            {"CPU socket in which the pins are inside of the socket rather than the CPU.",
                    "LGA - Land Grid Array"},
            {"Socket type that standard modern Intel CPU's use.",
                    "LGA - Land Grid Array"},
            {"Socket type that standard modern AMD CPU's use.",
                    "PGA - Pin Grid Array"},
            //Intel H3
            {"Number of pins on the Intel Haswell and Broadwell series CPU's.",
                    "1150"},
            {"Socket name for Intel CPU series featuring an LGA 1150 socket.",
                    "Socket H3"},
            {"Release date of Intel's Haswell and Broadwell CPU architecture CPU's.",
                    "2013"},
            {"Supported RAM type of Intel's H3 Socket CPU's.",
                    "DDR3 Dual Channel"},

            //Intel H2
            {"Number of pins on the Intel Sandy and Ivy Bridge series CPU's.",
                    "1155"},
            {"Socket name for Intel CPU series featuring an LGA 2011 socket.",
                    "Socket H2"},
            {"Release date of Intel's H2 socket CPU architecture CPU's.",
                    "2011"},
            {"Supported RAM type of Intel's H3 Socket CPU's.",
                    "DDR3 Dual Channel"},

            //Intel R
            {"Number of pins on the Intel Sandy/Ivy Bridge - E/EP and Haswell - E/EP series CPU's.",
                    "2011"},
            {"Socket name for Intel CPU series featuring an LGA 1150 socket.",
                    "Socket R"},
            {"Release date of Intel's R socket CPU architecture CPU's.",
                    "2013"},
            {"Supported RAM type of Intel's R socket CPU's.",
                    "DDR3/DDR4 Quad Channel"},

            //Intel B
            {"Number of pins on the Intel B Socket architecture.",
                    "1366"},
            {"Release date of Intel's B socket CPU architecture CPU's.",
                    "2008"},
            {"Supported RAM type of Intel's B socket CPU's.",
                    "DDR3 Triple Channel"},

            //Intel T
            {"Number of pins on the Intel T Socket architecture.",
                    "775"},
            {"Release date of Intel's T socket CPU architecture CPU's.",
                    "2004"},
            {"Supported RAM type of Intel's R socket CPU's.",
                    "DDR2 and DDR3"},
            {"Supported CPU's of Intel's LGA 775 architecture.",
                    "Pentium 4 and Core 2 series"},

            //Intel H / H1
            {"Socket name of an LGA 1156 socket architecture.",
                    "H/H1"},
            {"Release date of Intel's H/H1 socket CPU architecture CPU's.",
                    "2009"},
            {"Supported RAM type of Intel's H/H1 socket CPU's.",
                    "DDR3 Dual Channel"},

            //AMD AM3
            {"Number of pins on the AMD AM3 socket.",
                    "941"},
            {"Release date of AMD's AM3 socket.",
                    "2009"},
            {"Supported RAM type of AMD's AM3 architecture CPU's.",
                    "DDR2/DDR3 Dual Channel"},
            //Both
            {"CPU's supported by the AM3 and AM3+ socket architecture.",
                    "Athlon II and Phenom II"},

            //AMD AM3+
            {"Number of pins on the AMD AM3+ socket.",
                    "942"},
            {"Release date of AMD's AM3+ socket.",
                    "2011"},
            {"Supported RAM type of AMD's AM3+ architecture CPU's.",
                    "DDR3 Dual Channel"},

            //AMD FM1
            {"Number of pins on the AMD FM1 socket.",
                    "905"},
            {"Release date of AMD's FM1 socket.",
                    "2011"},
            {"Supported RAM type of AMD's FM1 architecture CPU's.",
                    "DDR3 Dual Channel"},
            {"Supported CPU of the AMD FM1 socket architecture.",
                    "AMD 10h"},

            //AMD FM2
            {"Number of pins on the AMD FM2 socket.",
                    "904"},
            {"Release date of AMD's FM2 socket.",
                    "2012"},
            {"Supported RAM type of AMD's FM2 architecture CPU's.",
                    "DDR3 Dual Channel"},
            {"Supported CPU of the AMD FM2 socket architecture.",
                    "Piledriver"},

            //AMD FM2+
            {"Number of pins on the AMD FM2+ socket.",
                    "906"},
            {"Release date of AMD's FM2+ socket.",
                    "2014"},
            {"Supported RAM type of AMD's FM2+ architecture CPU's.",
                    "DDR3 Dual Channel"},
            {"Supported CPU of the AMD FM2+ socket architecture.",
                    "Steamroller"},
    };

    //Below is for the 902.

    public String[][] commandLineTools = {
            //Windows
            {"Windows command-line tool used to wipe a disk, create a new filesystem, and prepare for use by the OS.",
                    "format"},
            {"Windows command used to create a new directory.",
                    "md or Mkdir"},
            {"Windows command used to change working directories.",
                    "cd or Chdir"},
            {"Windows command used to remove an existing directory.",
                    "rd or Rmdir"},
            {"Windows command used to delete a specific file.",
                    "del"},
            {"Windows command used to scan for and repair logical disk errors.",
                    "chkdsk /f"},
            {"Windows command used to locate bad sectors on a disk.",
                    "chkdsk /r"},
            {"Windows command used to add, remove, and/or list volumes/partitions.",
                    "diskpart"},
            {"Windows command used to duplicate a file.",
                    "copy"},
            {"Windows command-line tool used if you want to copy multiple files, or directories.",
                    "xcopy"},
            {"Windows command used to shutdown a computer.",
                    "shutdown"},
            {"Windows command used to display a list of processes that are currently running.",
                    "tasklist"},
            {"Windows command-line tool used to terminate processes by ID(PID - Process ID).",
                    "taskkill"},
            {"Windows command used to scan the file system for integrity.",
                    "sfc /scannow"},
            {"Windows command-line tool that functionally replaces xcopy, and has more features.",
                    "robocopy"},
            {"Windows command-line tool used to force a group policy update.",
                    "gpupdate"},
            {"Windows command used to verify policy settings.",
                    "gpresult"},
            {"Windows command-line tool used to remove files from a Windows cabinet file.",
                    "expand"},
            {"Windows command used to display all files and directories in the current working directory.",
                    "dir"},
            {"Windows command-line tool used to help resolve boot errors.",
                    "bootrec"},
            {"Windows command used to quit a script.",
                    "exit"},
            {"Windows command used to seek online information regarding the shell or command-line interface.",
                    "help"},

            //Linux
            {"Linux command-line tool used to list files and directories.",
                    "ls"},
            {"Linux command-line tool used to find text in a file.",
                    "grep"},
            {"Linux command used to change directories.",
                    "cd"},
            {"Linux command used to shutdown a computer.",
                    "shutdown"},
            {"Linux command used to get the path name to the current working directory.",
                    "pwd"},
            {"Linux command used to change a user account password.",
                    "passwd"},
            {"Linux command used to move or rename a file.",
                    "mv"},
            {"Linux command used to copy a file.",
                    "cp"},
            {"Linux command used to delete files or directories.",
                    "rm"},
            {"Linux command used to create a new directory.",
                    "mkdir"},
            {"Linux command used to change a file object mode.",
                    "chmod"},
            {"Linux command used to change a file owner.",
                    "chown"},
            {"Linux command used to view or change wireless network configurations.",
                    "iwconfig"},
            {"Linux command used to view or change interface and IP configurations.",
                    "ifconfig"},
            {"Linux command used to view current processes.",
                    "ps"},
            {"Linux command used to become a super user.",
                    "su"},
            {"In Linux, what can you append to a command in order to execute it as a super user?",
                    "sudo"},
            {"Linux command-line tool that handles package management.",
                    "apt-get"},
            {"Linux command that opens the VI editor.",
                    "vi"},
            {"Linux command-line tool used to convert and copy a file.",
                    "dd"},
    };

    public String[][] windowsFeaturesAndRequirements = {
            //Vista Home Basic
            {"What is the minimum CPU requirement for Windows Vista Home Basic?",
                    "800 MHz"},
            {"What is the minimum RAM requirement for Windows Vista Home Basic?",
                    "512 MB"},
            {"What is the minimum amount of free disk space required for Windows Vista?",
                    "15 GB"},
            {"What is the minimum HDD capacity requirement for Windows Vista Home Basic?",
                    "20 GB"},
            {"What is the minimum video/graphics RAM requirement for Windows Vista Home Basic?",
                    "32 MB"},

            //Vista others
            {"What is the minimum CPU requirement for Windows Vista versions aside from Home Basic?",
                    "1 GHz"},
            {"What is the minimum RAM requirement for Windows Vista versions aside from Home Basic?",
                    "1 GB"},
            {"What is the minimum HDD capacity requirement for Windows Vista versions aside from Home Basic?",
                    "40 GB"},
            {"What is the minimum video/graphics RAM requirement for Windows Vista versions aside from Home Basic?",
                    "128 MB"},

            //Windows 7
            {"What is the minimum CPU requirement for Windows 7?",
                    "1 GHz"},
            {"What is the minimum RAM requirement for Windows 7, 32-bit?",
                    "1 GB"},
            {"What is the minimum RAM requirement for Windows 7, 64-bit?",
                    "2 GB"},
            {"What is the minimum amount of free disk space required for Windows 7, 32-bit installation?",
                    "16 GB"},
            {"What is the minimum amount of free disk space required for Windows 7, 64-bit installation?",
                    "20 GB"},
            {"What is the video/graphics requirement for Windows 7?",
                    "DirectX 9 graphics with WDDM 1.0 or higher driver"},

            //Windows 8/8.1
            {"What is the minimum CPU requirement for Windows 8/8.1?",
                    "1 GHz with PAE, NX, and SSE2 support"},
            {"What is the minimum RAM requirement for Windows 8/8.1, 32-bit?",
                    "1 GB"},
            {"What is the minimum RAM requirement for Windows 8/8.1, 64-bit?",
                    "2 GB"},
            {"What is the minimum amount of free disk space required for Windows 8/8.1, 32-bit installation?",
                    "16 GB"},
            {"What is the minimum amount of free disk space required for Windows 8/8.1, 64-bit installation?",
                    "20 GB"},
            {"What is the video/graphics requirement for Windows 8/8.1?",
                    "DirectX 9 graphics with WDDM driver"},

            {"Can a 32-bit processor run both 32 and 64-bit versions of Windows OS's?",
                    "No"},
            {"Can a 64-bit processor run both 32 and 64-bit versions of Windows OS's?",
                    "Yes"},
            {"What is the only version of Windows Vista that does not have Aero?",
                    "Windows Vista Home Basic"},
            {"What is the only version of Windows 7 that does not have Aero?",
                    "Windows 7 Starter"},
            {"A feature built into certain versions of Windows that can encrypt entire partitions/volumes is known as?",
                    "BitLocker"},
            {"What versions of Windows have BitLocker capabilities?",
                    "Windows 7 Enterprise/Ultimate, & Windows 8 Pro/Enterprise"},
            {"Windows feature that allows you to allow or disallow traffic. Located in the Control Panel.",
                    "Windows Firewall"},
            {"Windows' built-in, real-time anti-malware solution.",
                    "Windows Defender"},
            {"Extension of Windows' command prompt.  Allows for automation of tasks.",
                    "Powershell"},
            {"Name of the Windows 7 feature that allows you to run an XP Service Pack 3 virtual machine.",
                    "Windows Virtual XP Mode"},
            {"Windows feature that allows you to migrate files and settings from Windows XP, Vista, 7, and 8/8.1.",
                    "Windows Easy Transfer"},
            {"Windows feature that allows you to use an external flash storage device as virtual RAM.",
                    "ReadyBoost"},
            {"Windows feature that allows you to run an application from an older Windows OS.",
                    "Compatibility Mode"},
            {"Windows feature that allows you to revert the OS to a previous point in order to fix errors.",
                    "System Restore"},
            {"Windows feature that prompts user for Administrative access in order to run properly.",
                    "UAC - User Account Control"},
            {"Version of Windows that used the Windows Side Bar.",
                    "Windows Vista"},
            {"Windows version that used Gadgets.",
                    "Windows 7"},
            {"Windows feature that allows taking manual or automatic backup copies or snapshots of computer files or volumes, even when they are in use.",
                    "Shadow Copy"},
            {"Windows Vista central location for viewing Anti-virus/Anti-spyware settings, security updates, etc.",
                    "Security Center"},
            {"Windows 8/8.1 shortcut bar available by swiping down from the corner on the right side of the screen.",
                    "Charms bar"},
            {"Formerly known as Metro UI, Windows 8/8.1 graphical interface used aside from the classic desktop.",
                    "Modern UI"},
            {"The term used for placing applications on the task bar for quick access.",
                    "Pinning"},
            {"Microsoft's solution for cloud storage integrated into Windows 8 and above.",
                    "OneDrive"},
            {"Drive letter assigned to Floppy Drives in Windows.",
                    "A"},
            {"Drive letter assigned to the primary HDD in Windows.",
                    "C"},
            {"Drive letter assigned to CD/DVD-ROM drive in Windows.",
                    "D"},
            {"Windows path to the User directory.",
                    "C:\\Users"},
            {"Windows path to the directory that stores all applications.",
                    "C:\\Program Files"},
            {"Windows path to Windows OS files.",
                    "C:\\Windows"},
            {"First Windows OS to allow you to sign-in using your Microsoft Account.",
                    "Windows 8/8.1"},
            {"Centralized location for purchasing ans downloading Windows programs.",
                    "Windows Store"}
    };

    public String[][] installWindows = {
            {"A client's HDD has been encrypted by a hacker, and wants Windows re-installed.  What installation type would be best?",
                    "Clean install"},
            {"Windows installation type that would be best if the client wants to keep all of their applications and data.",
                    "Upgrade"},
            {"A client's OS is not working properly.  They want to re-install Windows, but do not want to lose their documents.  What is the best method?",
                    "Refresh"},
            {"A HDD partition that stores OS files that can be used to restore an Operating System",
                    "Recovery Partition"},
    };

    public String[][] msTools = {
            {"Windows tool that allows you to enable/disable hardware devices, and configure drivers.",
                    "Device Manager"},
            {"Windows tool that allows you to change user privileges, and manage access to the OS",
                    "Users and Groups"},
            {"Windows tool that allows you to manage background processes.",
                    "Windows Services"},
            {"Windows tool that allows you to view hardware performance statistics. ",
                    "Performance Monitor"},
            {"Windows tool that allows you to schedule programs or batch files.",
                    "Task Scheduler"},
            {"Windows console that allows you to manage printers.",
                    "Printer Management"},
            {"Windows tool that allows you to perform RAM checks to ensure RAM is working properly.",
                    "Memory Diagnostics"},
            {"Manages the boot process in Windows. Includes startup tasks.",
                    "System Configuration (msconfig)"},
            {"Windows tool that allows you to view all current running programs and services.",
                    "Task manager"},
            {"Windows tool that allows you to create, edit, and delete partitions.",
                    "Windwos Disk Management"},
            {"Key/Value pair system used by the Windows Kernel, drivers, and services.",
                    "Registry"},
            {"Windows' basic built-in text editor.",
                    "Notepad"},
            {"Windows main graphical user interface.",
                    "Explorer"},
            {"Windows utility that allows you to move file fragments so they are contiguous.",
                    "defrag"},
            {"Allows you to control network access to protect from attacks on Windows computers.",
                    "Windows Firewall"},
            {"Allows you to manage power usage and plans on Windows computers.",
                    "Power Options"},
            {"Windows tool that allows you to return your computer to a previous configuration from an earlier point in time.",
                    "System Restore"},
            {"Central location in Windows to configure and install updates.",
                    "Windows Update"},
            {"Central location in Windows that allows you to configure all network adapters and configurations.",
                    "Network and Sharing Center"},
            {"Central location to view information about your computer including OS, and hardware.",
                    "System/System Information"},
    };

    public List<Question> convertStringListToQuestionList(List<String[]> stringList, String category){
        List<Question> questionList = new ArrayList<>();
        for(String[] s : stringList){
            questionList.add(
                    new Question(
                            s[0],
                            s[1],
                            category,
                            false
                    ));
        }
        return questionList;
    }

    //901
    public List<Question> getAll901Cards() {
        List<Question> listToReturn = new ArrayList<>();
        listToReturn.addAll(getBiosFlashcards());
        listToReturn.addAll(getMotherboardFlashcards());
        listToReturn.addAll(getRamFlashcards());
        listToReturn.addAll(getStorageFlashcards());
        listToReturn.addAll(getPrinterFlashcards());
        listToReturn.addAll(getNetworkingFlashcards());
        listToReturn.addAll(getMiscFlashcards());
        listToReturn.addAll(getCableAndTransferFlashcards());
        listToReturn.addAll(getCpuFlashcards());

        return listToReturn;
    }

    public List<Question> getBiosFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : biosFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "BIOS");
    }

    public List<Question> getMotherboardFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : motherboardFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "MOTHERBOARD");
    }

    public List<Question> getRamFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : ramFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "RAM");
    }

    public List<Question> getStorageFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : storageFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "STORAGE");
    }

    public List<Question> getPrinterFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : printerFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "PRINTER");
    }

    public List<Question> getNetworkingFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : networkingFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "NETWORKING");
    }

    public List<Question> getMiscFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : miscFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "MISC");
    }

    public List<Question> getCableAndTransferFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : cableAndTransferFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "CABLEANDTRANSFER");
    }

    public List<Question> getCpuFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : cpuFlashcards) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "CPU");
    }

    //902
    public List<Question> getCommandLineToolsFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : commandLineTools) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "COMMANDLINETOOLSL");
    }

    public List<Question> getWindowsFeaturesFlashcards() {
        List<String[]> listToReturn = new ArrayList();
        for (String[] i : windowsFeaturesAndRequirements) {
            listToReturn.add(i);
        }
        return convertStringListToQuestionList(listToReturn, "WINDOWSFEATURES");
    }
}